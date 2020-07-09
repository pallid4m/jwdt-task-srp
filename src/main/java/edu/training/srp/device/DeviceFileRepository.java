package edu.training.srp.device;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DeviceFileRepository {

    private final static String APPLIANCES_DB = "src/main/resources/appliances_db.txt";

    public List<Device> findDevices(String deviceName, String paramName, String paramValue) {
        List<Device> deviceList = new ArrayList<>();
        try (Reader reader = new FileReader(APPLIANCES_DB); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String patternDeviceName = deviceName.toLowerCase().concat(" :");
            String patternDeviceParam = paramName.toLowerCase().concat("=").concat(paramValue);
            deviceList = bufferedReader.lines()
                    .filter(line -> line.regionMatches(true, 0, patternDeviceName, 0, patternDeviceName.length()))
                    .filter(line -> line.toLowerCase().contains(patternDeviceParam))
                    .map(line -> DeviceFactory.createDevice(deviceName, parseParams(line)))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return deviceList;
    }

    private String[] parseParams(String line) {
        String regexParams = "(?<==)(.+?)(?=,|$)";
        Pattern pattern = Pattern.compile(regexParams);
        Matcher matcher = pattern.matcher(line);
        return matcher.results().map(MatchResult::group).toArray(String[]::new);
    }
}

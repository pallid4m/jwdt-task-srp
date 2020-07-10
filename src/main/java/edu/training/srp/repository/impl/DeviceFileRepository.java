package edu.training.srp.repository.impl;

import edu.training.srp.domain.device.Device;
import edu.training.srp.domain.device.DeviceFactory;
import edu.training.srp.repository.DeviceRepository;
import edu.training.srp.repository.util.DeviceFileUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class DeviceFileRepository implements DeviceRepository {

    private final static String APPLIANCES_DB = "src/main/resources/appliances_db.txt";

    @Override
    public List<Device> findDevicesByParam(String deviceName, String paramName, String paramValue) {
        List<Device> deviceList = new ArrayList<>();
        try (Reader reader = new FileReader(APPLIANCES_DB); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String normDeviceName = DeviceFileUtil.normalizeName(deviceName);
            String normDeviceParam = DeviceFileUtil.normalizeParam(paramName, paramValue);
            String[] resultQuery = bufferedReader.lines()
                    .filter(Predicate.not(String::isBlank))
                    .map(String::toLowerCase)
                    .filter(line -> line.startsWith(normDeviceName))
                    .filter(line -> line.contains(normDeviceParam))
                    .toArray(String[]::new);
            for (String row : resultQuery) {
                String[] deviceParams = DeviceFileUtil.parseParams(row);
                Device device = DeviceFactory.createDevice(deviceName, deviceParams);
                deviceList.add(device);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return deviceList;
    }
}

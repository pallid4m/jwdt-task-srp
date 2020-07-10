package edu.training.srp.repository.util;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeviceFileUtil {

    public static String[] parseParams(String device) {
        String regexParams = "(?<==)(.+?)(?=,|$)";
        Pattern pattern = Pattern.compile(regexParams);
        Matcher matcher = pattern.matcher(device);
        return matcher.results().map(MatchResult::group).toArray(String[]::new);
    }

    public static String normalizeName(String deviceName) {
        return deviceName.toLowerCase().concat(" :");
    }

    public static String normalizeParam(String paramName, String paramValue) {
        return paramName.toLowerCase().concat("=").concat(paramValue);
    }
}

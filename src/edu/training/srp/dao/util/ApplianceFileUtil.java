package edu.training.srp.dao.util;

import edu.training.srp.entity.criteria.Criteria;

import java.util.Map;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ApplianceFileUtil {

    private static final String PARAMS_REGEX = "(?<==).+?(?=,|$)";

    private static final String KEY_VALUE_DELIMITER = "=";
    private static final String PARAM_DELIMITER = "(?=,|$)";

    private ApplianceFileUtil() {}

    public static String[] parseParams(String row) {
        Pattern pattern = Pattern.compile(PARAMS_REGEX);
        Matcher matcher = pattern.matcher(row);
        return matcher.results().map(MatchResult::group).toArray(String[]::new);
    }

    public static boolean classMatch(Criteria criteria, String row) {
        String namePattern = criteria.getGroupSearchName() + " :";
        return row.startsWith(namePattern);
    }

    public static boolean paramsMatch(Criteria criteria, String row) {
        for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
            String paramPattern = entry.getKey() + KEY_VALUE_DELIMITER + entry.getValue() + PARAM_DELIMITER;
            Pattern pattern = Pattern.compile(paramPattern);
            Matcher matcher = pattern.matcher(row);
            if (!matcher.find()) {
                return false;
            }
        }
        return true;
    }
}

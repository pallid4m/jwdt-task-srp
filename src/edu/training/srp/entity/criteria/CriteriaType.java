package edu.training.srp.entity.criteria;

import edu.training.srp.entity.criteria.type.*;

import java.util.Map;

public class CriteriaType {

    private static ApplianceTypeProvider provider = new ApplianceTypeProvider();

    public static Map<String, Class<?>> getRules(String name) {
        ApplianceType applianceType = provider.getApplianceType(name);
        return applianceType.getTypeRules();
    }
}

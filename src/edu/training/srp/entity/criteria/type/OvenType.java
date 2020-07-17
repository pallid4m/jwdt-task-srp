package edu.training.srp.entity.criteria.type;

import edu.training.srp.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public final class OvenType implements ApplianceType {

    private final Map<String, Class<?>> ovenTypeRules = new HashMap<>();

    {
        ovenTypeRules.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), Integer.class);
        ovenTypeRules.put(SearchCriteria.Oven.WEIGHT.toString(), Integer.class);
        ovenTypeRules.put(SearchCriteria.Oven.CAPACITY.toString(), Integer.class);
        ovenTypeRules.put(SearchCriteria.Oven.DEPTH.toString(), Integer.class);
        ovenTypeRules.put(SearchCriteria.Oven.HEIGHT.toString(), Double.class);
        ovenTypeRules.put(SearchCriteria.Oven.WIDTH.toString(), Double.class);
    }

    @Override
    public Map<String, Class<?>> getTypeRules() {
        return ovenTypeRules;
    }
}

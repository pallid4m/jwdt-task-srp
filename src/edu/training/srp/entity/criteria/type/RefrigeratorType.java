package edu.training.srp.entity.criteria.type;

import edu.training.srp.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public final class RefrigeratorType implements ApplianceType {

    private final Map<String, Class<?>> refrigeratorTypeRules = new HashMap<>();

    {
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), Integer.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.WEIGHT.toString(), Integer.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), Integer.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), Double.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.HEIGHT.toString(), Integer.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.WIDTH.toString(), Integer.class);
    }

    @Override
    public Map<String, Class<?>> getTypeRules() {
        return refrigeratorTypeRules;
    }
}

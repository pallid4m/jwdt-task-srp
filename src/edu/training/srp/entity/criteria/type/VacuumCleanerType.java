package edu.training.srp.entity.criteria.type;

import edu.training.srp.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public final class VacuumCleanerType implements ApplianceType {

    private final Map<String, Class<?>> vacuumCleanerTypeRules = new HashMap<>();

    {
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), Integer.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), String.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), String.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), String.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), Integer.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), Integer.class);
    }

    @Override
    public Map<String, Class<?>> getTypeRules() {
        return vacuumCleanerTypeRules;
    }
}

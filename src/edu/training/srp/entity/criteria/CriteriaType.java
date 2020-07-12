package edu.training.srp.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class CriteriaType {

    private final Map<String, Class<?>> ovenTypeRules = new HashMap<>();
    private final Map<String, Class<?>> laptopTypeRules = new HashMap<>();
    private final Map<String, Class<?>> refrigeratorTypeRules = new HashMap<>();
    private final Map<String, Class<?>> vacuumCleanerTypeRules = new HashMap<>();
    private final Map<String, Class<?>> tabletPCTypeRules = new HashMap<>();
    private final Map<String, Class<?>> speakersTypeRules = new HashMap<>();

    {
        ovenTypeRules.put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), Integer.class);
        ovenTypeRules.put(SearchCriteria.Oven.WEIGHT.toString(), Integer.class);
        ovenTypeRules.put(SearchCriteria.Oven.CAPACITY.toString(), Integer.class);
        ovenTypeRules.put(SearchCriteria.Oven.DEPTH.toString(), Integer.class);
        ovenTypeRules.put(SearchCriteria.Oven.HEIGHT.toString(), Double.class);
        ovenTypeRules.put(SearchCriteria.Oven.WIDTH.toString(), Double.class);
    }

    {
        laptopTypeRules.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), Double.class);
        laptopTypeRules.put(SearchCriteria.Laptop.OS.toString(), String.class);
        laptopTypeRules.put(SearchCriteria.Laptop.MEMORY_ROM.toString(), Integer.class);
        laptopTypeRules.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), Integer.class);
        laptopTypeRules.put(SearchCriteria.Laptop.CPU.toString(), Double.class);
        laptopTypeRules.put(SearchCriteria.Laptop.DISPLAY_INCHS.toString(), Integer.class);
    }

    {
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), Integer.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.WEIGHT.toString(), Integer.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), Integer.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), Double.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.HEIGHT.toString(), Integer.class);
        refrigeratorTypeRules.put(SearchCriteria.Refrigerator.WIDTH.toString(), Integer.class);
    }

    {
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), Integer.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), String.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), String.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), String.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), Integer.class);
        vacuumCleanerTypeRules.put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), Integer.class);
    }

    {
        tabletPCTypeRules.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(), Integer.class);
        tabletPCTypeRules.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), Integer.class);
        tabletPCTypeRules.put(SearchCriteria.TabletPC.MEMORY_ROM.toString(), Integer.class);
        tabletPCTypeRules.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), Integer.class);
        tabletPCTypeRules.put(SearchCriteria.TabletPC.COLOR.toString(), String.class);
    }

    {
        speakersTypeRules.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), Integer.class);
        speakersTypeRules.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), Integer.class);
        speakersTypeRules.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), String.class);
        speakersTypeRules.put(SearchCriteria.Speakers.CORD_LENGTH.toString(), Integer.class);
    }

    public Map<String, Class<?>> getRules(String name) {
        if (name.equals(SearchCriteria.Oven.class.getSimpleName())) {
            return ovenTypeRules;
        }
        if (name.equals(SearchCriteria.Laptop.class.getSimpleName())) {
            return laptopTypeRules;
        }
        if (name.equals(SearchCriteria.Refrigerator.class.getSimpleName())) {
            return refrigeratorTypeRules;
        }
        if (name.equals(SearchCriteria.VacuumCleaner.class.getSimpleName())) {
            return vacuumCleanerTypeRules;
        }
        if (name.equals(SearchCriteria.TabletPC.class.getSimpleName())) {
            return tabletPCTypeRules;
        }
        if (name.equals(SearchCriteria.Speakers.class.getSimpleName())) {
            return speakersTypeRules;
        }
        return null;
    }
}

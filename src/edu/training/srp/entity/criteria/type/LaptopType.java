package edu.training.srp.entity.criteria.type;

import edu.training.srp.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public final class LaptopType implements ApplianceType {

    private final Map<String, Class<?>> laptopTypeRules = new HashMap<>();

    {
        laptopTypeRules.put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), Double.class);
        laptopTypeRules.put(SearchCriteria.Laptop.OS.toString(), String.class);
        laptopTypeRules.put(SearchCriteria.Laptop.MEMORY_ROM.toString(), Integer.class);
        laptopTypeRules.put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), Integer.class);
        laptopTypeRules.put(SearchCriteria.Laptop.CPU.toString(), Double.class);
        laptopTypeRules.put(SearchCriteria.Laptop.DISPLAY_INCHS.toString(), Integer.class);
    }

    @Override
    public Map<String, Class<?>> getTypeRules() {
        return laptopTypeRules;
    }
}

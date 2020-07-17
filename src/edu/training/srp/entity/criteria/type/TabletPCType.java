package edu.training.srp.entity.criteria.type;

import edu.training.srp.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public final class TabletPCType implements ApplianceType {

    private final Map<String, Class<?>> tabletPCTypeRules = new HashMap<>();

    {
        tabletPCTypeRules.put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(), Integer.class);
        tabletPCTypeRules.put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), Integer.class);
        tabletPCTypeRules.put(SearchCriteria.TabletPC.MEMORY_ROM.toString(), Integer.class);
        tabletPCTypeRules.put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), Integer.class);
        tabletPCTypeRules.put(SearchCriteria.TabletPC.COLOR.toString(), String.class);
    }

    @Override
    public Map<String, Class<?>> getTypeRules() {
        return tabletPCTypeRules;
    }
}

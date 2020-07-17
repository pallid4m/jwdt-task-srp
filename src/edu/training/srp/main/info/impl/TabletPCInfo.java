package edu.training.srp.main.info.impl;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.TabletPC;
import edu.training.srp.entity.criteria.SearchCriteria;
import edu.training.srp.main.info.ApplianceInfo;

public class TabletPCInfo implements ApplianceInfo {

    @Override
    public String info(Appliance appliance) {
        TabletPC tabletPC = (TabletPC) appliance;
        return tabletPC.getClass().getSimpleName() + ": " +
                SearchCriteria.TabletPC.BATTERY_CAPACITY.toString() + "=" + tabletPC.getBatteryCapacity() +
                ", " +
                SearchCriteria.TabletPC.DISPLAY_INCHES.toString() + "=" + tabletPC.getDisplayInches() +
                ", " +
                SearchCriteria.TabletPC.MEMORY_ROM.toString() + "=" + tabletPC.getMemoryRom() +
                ", " +
                SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString() + "=" + tabletPC.getFlashMemoryCapacity() +
                ", " +
                SearchCriteria.TabletPC.COLOR.toString() + "=" + tabletPC.getColor();
    }
}

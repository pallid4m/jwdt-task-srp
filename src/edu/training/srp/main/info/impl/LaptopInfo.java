package edu.training.srp.main.info.impl;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Laptop;
import edu.training.srp.entity.criteria.SearchCriteria;
import edu.training.srp.main.info.ApplianceInfo;

public class LaptopInfo implements ApplianceInfo {

    @Override
    public String info(Appliance appliance) {
        Laptop laptop = (Laptop) appliance;
        return laptop.getClass().getSimpleName() + ": " +
                SearchCriteria.Laptop.BATTERY_CAPACITY.toString() + "=" + laptop.getBatteryCapacity() +
                ", " +
                SearchCriteria.Laptop.OS.toString() + "=" + laptop.getOs() +
                ", " +
                SearchCriteria.Laptop.MEMORY_ROM.toString() + "=" + laptop.getMemoryRom() +
                ", " +
                SearchCriteria.Laptop.SYSTEM_MEMORY.toString() + "=" + laptop.getSystemMemory() +
                ", " +
                SearchCriteria.Laptop.CPU.toString() + "=" + laptop.getCpu() +
                ", " +
                SearchCriteria.Laptop.DISPLAY_INCHS.toString() + "=" + laptop.getDisplayInchs();
    }
}

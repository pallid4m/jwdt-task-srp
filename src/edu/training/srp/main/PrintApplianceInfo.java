package edu.training.srp.main;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Oven;
import edu.training.srp.entity.Laptop;
import edu.training.srp.entity.Refrigerator;
import edu.training.srp.entity.VacuumCleaner;
import edu.training.srp.entity.TabletPC;
import edu.training.srp.entity.Speakers;
import edu.training.srp.entity.criteria.SearchCriteria;

public class PrintApplianceInfo {

    public static void print(Appliance appliance) {
        if (appliance == null) {
            return;
        }
        StringBuilder info = new StringBuilder();
        String applianceName = appliance.getClass().getSimpleName();
        info.append(applianceName).append(" : ");

        String applianceView = "";
        if (applianceName.equals(SearchCriteria.Oven.class.getSimpleName())) {
            Oven oven = (Oven) appliance;
            applianceView = view(oven);
        } else if (applianceName.equals(SearchCriteria.Laptop.class.getSimpleName())) {
            Laptop laptop = (Laptop) appliance;
            applianceView = view(laptop);
        } else if (applianceName.equals(SearchCriteria.Refrigerator.class.getSimpleName())) {
            Refrigerator refrigerator = (Refrigerator) appliance;
            applianceView = view(refrigerator);
        } else if (applianceName.equals(SearchCriteria.VacuumCleaner.class.getSimpleName())) {
            VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
            applianceView = view(vacuumCleaner);
        } else if (applianceName.equals(SearchCriteria.TabletPC.class.getSimpleName())) {
            TabletPC tabletPC = (TabletPC) appliance;
            applianceView = view(tabletPC);
        } else if (applianceName.equals(SearchCriteria.Speakers.class.getSimpleName())) {
            Speakers speakers = (Speakers) appliance;
            applianceView = view(speakers);
        }

        info.append(applianceView);

        System.out.println(info);
    }

    private static String view(Oven oven) {
        return SearchCriteria.Oven.POWER_CONSUMPTION.toString() + "=" + oven.getPowerConsumption() +
                ", " +
                SearchCriteria.Oven.WEIGHT.toString() + "=" + oven.getWeight() +
                ", " +
                SearchCriteria.Oven.CAPACITY.toString() + "=" + oven.getCapacity() +
                ", " +
                SearchCriteria.Oven.DEPTH.toString() + "=" + oven.getDepth() +
                ", " +
                SearchCriteria.Oven.HEIGHT.toString() + "=" + oven.getHeight() +
                ", " +
                SearchCriteria.Oven.WIDTH.toString() + "=" + oven.getWidth();
    }

    private static String view(Laptop laptop) {
        return SearchCriteria.Laptop.BATTERY_CAPACITY.toString() + "=" + laptop.getBatteryCapacity() +
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

    private static String view(Refrigerator refrigerator) {
        return SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString() + "=" + refrigerator.getPowerConsumption() +
                ", " +
                SearchCriteria.Refrigerator.WEIGHT.toString() + "=" + refrigerator.getWeight() +
                ", " +
                SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString() + "=" + refrigerator.getFreezerCapacity() +
                ", " +
                SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString() + "=" + refrigerator.getOverallCapacity() +
                ", " +
                SearchCriteria.Refrigerator.HEIGHT.toString() + "=" + refrigerator.getHeight() +
                ", " +
                SearchCriteria.Refrigerator.WIDTH.toString() + "=" + refrigerator.getWidth();
    }

    private static String view(VacuumCleaner vacuumCleaner) {
        return SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString() + "=" + vacuumCleaner.getPowerConsumption() +
                ", " +
                SearchCriteria.VacuumCleaner.FILTER_TYPE.toString() + "=" + vacuumCleaner.getFilterType() +
                ", " +
                SearchCriteria.VacuumCleaner.BAG_TYPE.toString() + "=" + vacuumCleaner.getBagType() +
                ", " +
                SearchCriteria.VacuumCleaner.WAND_TYPE.toString() + "=" + vacuumCleaner.getWandType() +
                ", " +
                SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString() + "=" + vacuumCleaner.getMotorSpeedRegulation() +
                ", " +
                SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString() + "=" + vacuumCleaner.getCleaningWidth();
    }

    private static String view(TabletPC tabletPC) {
        return SearchCriteria.TabletPC.BATTERY_CAPACITY.toString() + "=" + tabletPC.getBatteryCapacity() +
                ", " +
                SearchCriteria.TabletPC.DISPLAY_INCHES.toString() + "=" + tabletPC.getDisplayInches() +
                ", " +
                SearchCriteria.TabletPC.MEMORY_ROM.toString() + "=" + tabletPC.getMemoryRom() +
                ", " +
                SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString() + "=" + tabletPC.getFlashMemoryCapacity() +
                ", " +
                SearchCriteria.TabletPC.COLOR.toString() + "=" + tabletPC.getColor();
    }

    private static String view(Speakers speakers) {
        return SearchCriteria.Speakers.POWER_CONSUMPTION.toString() + "=" + speakers.getPowerConsumption() +
                ", " +
                SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString() + "=" + speakers.getNumberOfSpeakers() +
                ", " +
                SearchCriteria.Speakers.FREQUENCY_RANGE.toString() + "=" + speakers.getFrequencyRange() +
                ", " +
                SearchCriteria.Speakers.CORD_LENGTH.toString() + "=" + speakers.getCordLength();
    }
}

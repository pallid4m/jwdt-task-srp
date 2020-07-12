package edu.training.srp.entity;

public final class ApplianceFactory {

    private ApplianceFactory() {}

    public static Appliance createAppliance(String applianceName, String[] params) {
        if (applianceName.equals(Oven.class.getSimpleName())) {
            return Oven.builder()
                    .setPowerConsumption(Integer.valueOf(params[0]))
                    .setWeight(Integer.valueOf(params[1]))
                    .setCapacity(Integer.valueOf(params[2]))
                    .setDepth(Integer.valueOf(params[3]))
                    .setHeight(Double.valueOf(params[4]))
                    .setWidth(Double.valueOf(params[5]))
                    .build();
        }
        if (applianceName.equals(Laptop.class.getSimpleName())) {
            return Laptop.builder()
                    .setBatteryCapacity(Double.valueOf(params[0]))
                    .setOs(params[1])
                    .setMemoryRom(Integer.valueOf(params[2]))
                    .setSystemMemory(Integer.valueOf(params[3]))
                    .setCpu(Double.valueOf(params[4]))
                    .setDisplayInchs(Integer.valueOf(params[5]))
                    .build();
        }
        if (applianceName.equals(Refrigerator.class.getSimpleName())) {
            return Refrigerator.builder()
                    .setPowerConsumption(Integer.valueOf(params[0]))
                    .setWeight(Integer.valueOf(params[1]))
                    .setFreezerCapacity(Integer.valueOf(params[2]))
                    .setOverallCapacity(Double.valueOf(params[3]))
                    .setHeight(Integer.valueOf(params[4]))
                    .setWidth(Integer.valueOf(params[5]))
                    .build();
        }
        if (applianceName.equals(VacuumCleaner.class.getSimpleName())) {
            return VacuumCleaner.builder()
                    .setPowerConsumption(Integer.valueOf(params[0]))
                    .setFilterType(params[1])
                    .setBagType(params[2])
                    .setWandType(params[3])
                    .setMotorSpeedRegulation(Integer.valueOf(params[4]))
                    .setCleaningWidth(Integer.valueOf(params[5]))
                    .build();
        }
        if (applianceName.equals(TabletPC.class.getSimpleName())) {
            return TabletPC.builder()
                    .setBatteryCapacity(Integer.valueOf(params[0]))
                    .setDisplayInches(Integer.valueOf(params[1]))
                    .setMemoryRom(Integer.valueOf(params[2]))
                    .setFlashMemoryCapacity(Integer.valueOf(params[3]))
                    .setColor(params[4])
                    .build();
        }
        if (applianceName.equals(Speakers.class.getSimpleName())) {
            return Speakers.builder()
                    .setPowerConsumption(Integer.valueOf(params[0]))
                    .setNumberOfSpeakers(Integer.valueOf(params[1]))
                    .setFrequencyRange(params[2])
                    .setCordLength(Integer.valueOf(params[3]))
                    .build();
        }
        return null;
    }
}

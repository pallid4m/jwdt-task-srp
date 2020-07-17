package edu.training.srp.entity.creator;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.VacuumCleaner;

public class VacuumCleanerCreator implements ApplianceCreator {

    @Override
    public Appliance create(String[] params) {
        return VacuumCleaner.builder()
                .setPowerConsumption(Integer.valueOf(params[0]))
                .setFilterType(params[1])
                .setBagType(params[2])
                .setWandType(params[3])
                .setMotorSpeedRegulation(Integer.valueOf(params[4]))
                .setCleaningWidth(Integer.valueOf(params[5]))
                .build();
    }
}

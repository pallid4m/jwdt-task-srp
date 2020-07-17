package edu.training.srp.entity.creator;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Refrigerator;

public class RefrigeratorCreator implements ApplianceCreator {

    @Override
    public Appliance create(String[] params) {
        return Refrigerator.builder()
                .setPowerConsumption(Integer.valueOf(params[0]))
                .setWeight(Integer.valueOf(params[1]))
                .setFreezerCapacity(Integer.valueOf(params[2]))
                .setOverallCapacity(Double.valueOf(params[3]))
                .setHeight(Integer.valueOf(params[4]))
                .setWidth(Integer.valueOf(params[5]))
                .build();
    }
}

package edu.training.srp.entity.creator;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Oven;

public class OvenCreator implements ApplianceCreator {

    @Override
    public Appliance create(String[] params) {
        return Oven.builder()
                .setPowerConsumption(Integer.valueOf(params[0]))
                .setWeight(Integer.valueOf(params[1]))
                .setCapacity(Integer.valueOf(params[2]))
                .setDepth(Integer.valueOf(params[3]))
                .setHeight(Double.valueOf(params[4]))
                .setWidth(Double.valueOf(params[5]))
                .build();
    }
}

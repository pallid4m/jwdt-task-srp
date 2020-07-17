package edu.training.srp.entity.creator;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Laptop;

public class LaptopCreator implements ApplianceCreator {

    @Override
    public Appliance create(String[] params) {
        return Laptop.builder()
                .setBatteryCapacity(Double.valueOf(params[0]))
                .setOs(params[1])
                .setMemoryRom(Integer.valueOf(params[2]))
                .setSystemMemory(Integer.valueOf(params[3]))
                .setCpu(Double.valueOf(params[4]))
                .setDisplayInchs(Integer.valueOf(params[5]))
                .build();
    }
}

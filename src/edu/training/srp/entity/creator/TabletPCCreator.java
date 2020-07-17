package edu.training.srp.entity.creator;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.TabletPC;

public class TabletPCCreator implements ApplianceCreator {

    @Override
    public Appliance create(String[] params) {
        return TabletPC.builder()
                .setBatteryCapacity(Integer.valueOf(params[0]))
                .setDisplayInches(Integer.valueOf(params[1]))
                .setMemoryRom(Integer.valueOf(params[2]))
                .setFlashMemoryCapacity(Integer.valueOf(params[3]))
                .setColor(params[4])
                .build();
    }
}

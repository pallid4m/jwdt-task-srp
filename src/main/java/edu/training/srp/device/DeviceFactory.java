package edu.training.srp.device;

import edu.training.srp.device.impl.*;

public class DeviceFactory {

    public static Device createDevice(String device, String[] params) {
        if (device.isBlank()) {
            return null;
        }
        if (device.equalsIgnoreCase( "Laptop")) {
            return new Laptop(params);
        }
        if (device.equalsIgnoreCase( "Oven")) {
            return new Oven(params);
        }
        if (device.equalsIgnoreCase("Refrigerator")) {
            return new Refrigerator(params);
        }
        if (device.equalsIgnoreCase("VacuumCleaner")) {
            return new VacuumCleaner(params);
        }
        if (device.equalsIgnoreCase("TabletPC")) {
            return new TabletPC(params);
        }
        if (device.equalsIgnoreCase("Speakers")) {
            return new Speakers(params);
        }
        return null;
    }
}

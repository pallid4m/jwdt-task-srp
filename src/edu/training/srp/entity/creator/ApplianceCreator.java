package edu.training.srp.entity.creator;

import edu.training.srp.entity.Appliance;

public interface ApplianceCreator {
    Appliance create(String[] params);
}

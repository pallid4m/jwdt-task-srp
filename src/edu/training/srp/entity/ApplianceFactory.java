package edu.training.srp.entity;

import edu.training.srp.entity.creator.ApplianceProvider;
import edu.training.srp.entity.creator.ApplianceCreator;

public final class ApplianceFactory {
    private static final ApplianceFactory instance = new ApplianceFactory();

    private final ApplianceProvider provider = new ApplianceProvider();

    private ApplianceFactory() {}

    public Appliance createAppliance(String applianceName, String[] params) {
        ApplianceCreator applianceCreator = provider.getCreator(applianceName);
        return applianceCreator.create(params);
    }

    public static ApplianceFactory getInstance() {
        return instance;
    }
}

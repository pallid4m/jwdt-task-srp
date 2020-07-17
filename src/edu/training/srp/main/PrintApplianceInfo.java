package edu.training.srp.main;

import edu.training.srp.entity.Appliance;
import edu.training.srp.main.info.ApplianceInfo;
import edu.training.srp.main.info.ApplianceInfoProvider;

public class PrintApplianceInfo {

    private static final ApplianceInfoProvider provider = new ApplianceInfoProvider();

    public static void print(Appliance appliance) {
        if (appliance == null) {
            return;
        }
        String applianceName = appliance.getClass().getSimpleName();
        ApplianceInfo applianceInfo = provider.getApplianceInfo(applianceName);
        String info = applianceInfo.info(appliance);
        System.out.println(info);
    }
}

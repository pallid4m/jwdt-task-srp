package edu.training.srp.main.info;

import edu.training.srp.entity.Oven;
import edu.training.srp.entity.Laptop;
import edu.training.srp.entity.Refrigerator;
import edu.training.srp.entity.VacuumCleaner;
import edu.training.srp.entity.TabletPC;
import edu.training.srp.entity.Speakers;
import edu.training.srp.main.info.impl.OvenInfo;
import edu.training.srp.main.info.impl.LaptopInfo;
import edu.training.srp.main.info.impl.RefrigeratorInfo;
import edu.training.srp.main.info.impl.VacuumCleanerInfo;
import edu.training.srp.main.info.impl.TabletPCInfo;
import edu.training.srp.main.info.impl.SpeakersInfo;

import java.util.HashMap;
import java.util.Map;

public class ApplianceInfoProvider {

    private final Map<String, ApplianceInfo> infoMap = new HashMap<>();

    {
        infoMap.put(Oven.class.getSimpleName(), new OvenInfo());
        infoMap.put(Laptop.class.getSimpleName(), new LaptopInfo());
        infoMap.put(Refrigerator.class.getSimpleName(), new RefrigeratorInfo());
        infoMap.put(VacuumCleaner.class.getSimpleName(), new VacuumCleanerInfo());
        infoMap.put(TabletPC.class.getSimpleName(), new TabletPCInfo());
        infoMap.put(Speakers.class.getSimpleName(), new SpeakersInfo());
    }

    public ApplianceInfo getApplianceInfo(String applianceName) {
        return infoMap.get(applianceName);
    }
}

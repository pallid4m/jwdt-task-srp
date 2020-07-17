package edu.training.srp.entity.creator;

import edu.training.srp.entity.Oven;
import edu.training.srp.entity.Laptop;
import edu.training.srp.entity.Refrigerator;
import edu.training.srp.entity.VacuumCleaner;
import edu.training.srp.entity.TabletPC;
import edu.training.srp.entity.Speakers;

import java.util.HashMap;
import java.util.Map;

public class ApplianceProvider {

    private final Map<String, ApplianceCreator> creatorMap = new HashMap<>();

    {
        creatorMap.put(Oven.class.getSimpleName(), new OvenCreator());
        creatorMap.put(Laptop.class.getSimpleName(), new LaptopCreator());
        creatorMap.put(Refrigerator.class.getSimpleName(), new RefrigeratorCreator());
        creatorMap.put(VacuumCleaner.class.getSimpleName(), new VacuumCleanerCreator());
        creatorMap.put(TabletPC.class.getSimpleName(), new TabletPCCreator());
        creatorMap.put(Speakers.class.getSimpleName(), new SpeakersCreator());
    }

    public ApplianceCreator getCreator(String applianceName) {
        return creatorMap.get(applianceName);
    }
}

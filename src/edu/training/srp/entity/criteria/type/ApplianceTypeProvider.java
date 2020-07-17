package edu.training.srp.entity.criteria.type;

import edu.training.srp.entity.Oven;
import edu.training.srp.entity.Laptop;
import edu.training.srp.entity.Refrigerator;
import edu.training.srp.entity.VacuumCleaner;
import edu.training.srp.entity.TabletPC;
import edu.training.srp.entity.Speakers;

import java.util.HashMap;
import java.util.Map;

public class ApplianceTypeProvider {

    private final Map<String, ApplianceType> applianceTypeMap = new HashMap<>();

    {
        applianceTypeMap.put(Oven.class.getSimpleName(), new OvenType());
        applianceTypeMap.put(Laptop.class.getSimpleName(), new LaptopType());
        applianceTypeMap.put(Refrigerator.class.getSimpleName(), new RefrigeratorType());
        applianceTypeMap.put(VacuumCleaner.class.getSimpleName(), new VacuumCleanerType());
        applianceTypeMap.put(TabletPC.class.getSimpleName(), new TabletPCType());
        applianceTypeMap.put(Speakers.class.getSimpleName(), new SpeakersType());
    }

    public ApplianceType getApplianceType(String typeName) {
        return applianceTypeMap.get(typeName);
    }
}

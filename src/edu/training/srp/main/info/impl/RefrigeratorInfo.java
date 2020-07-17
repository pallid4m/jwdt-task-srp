package edu.training.srp.main.info.impl;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Refrigerator;
import edu.training.srp.entity.criteria.SearchCriteria;
import edu.training.srp.main.info.ApplianceInfo;

public class RefrigeratorInfo implements ApplianceInfo {

    @Override
    public String info(Appliance appliance) {
        Refrigerator refrigerator = (Refrigerator) appliance;
        return refrigerator.getClass().getSimpleName() + ": " +
                SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString() + "=" + refrigerator.getPowerConsumption() +
                ", " +
                SearchCriteria.Refrigerator.WEIGHT.toString() + "=" + refrigerator.getWeight() +
                ", " +
                SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString() + "=" + refrigerator.getFreezerCapacity() +
                ", " +
                SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString() + "=" + refrigerator.getOverallCapacity() +
                ", " +
                SearchCriteria.Refrigerator.HEIGHT.toString() + "=" + refrigerator.getHeight() +
                ", " +
                SearchCriteria.Refrigerator.WIDTH.toString() + "=" + refrigerator.getWidth();
    }
}

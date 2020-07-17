package edu.training.srp.main.info.impl;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Oven;
import edu.training.srp.entity.criteria.SearchCriteria;
import edu.training.srp.main.info.ApplianceInfo;

public class OvenInfo implements ApplianceInfo {

    @Override
    public String info(Appliance appliance) {
        Oven oven = (Oven) appliance;
        return oven.getClass().getSimpleName() + ": " +
                SearchCriteria.Oven.POWER_CONSUMPTION.toString() + "=" + oven.getPowerConsumption() +
                ", " +
                SearchCriteria.Oven.WEIGHT.toString() + "=" + oven.getWeight() +
                ", " +
                SearchCriteria.Oven.CAPACITY.toString() + "=" + oven.getCapacity() +
                ", " +
                SearchCriteria.Oven.DEPTH.toString() + "=" + oven.getDepth() +
                ", " +
                SearchCriteria.Oven.HEIGHT.toString() + "=" + oven.getHeight() +
                ", " +
                SearchCriteria.Oven.WIDTH.toString() + "=" + oven.getWidth();
    }
}

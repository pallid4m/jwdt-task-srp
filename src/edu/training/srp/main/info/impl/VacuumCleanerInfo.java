package edu.training.srp.main.info.impl;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.VacuumCleaner;
import edu.training.srp.entity.criteria.SearchCriteria;
import edu.training.srp.main.info.ApplianceInfo;

public class VacuumCleanerInfo implements ApplianceInfo {

    @Override
    public String info(Appliance appliance) {
        VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
        return SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString() + "=" + vacuumCleaner.getPowerConsumption() +
                ", " +
                SearchCriteria.VacuumCleaner.FILTER_TYPE.toString() + "=" + vacuumCleaner.getFilterType() +
                ", " +
                SearchCriteria.VacuumCleaner.BAG_TYPE.toString() + "=" + vacuumCleaner.getBagType() +
                ", " +
                SearchCriteria.VacuumCleaner.WAND_TYPE.toString() + "=" + vacuumCleaner.getWandType() +
                ", " +
                SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString() + "=" + vacuumCleaner.getMotorSpeedRegulation() +
                ", " +
                SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString() + "=" + vacuumCleaner.getCleaningWidth();
    }
}

package edu.training.srp.main.info.impl;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Speakers;
import edu.training.srp.entity.criteria.SearchCriteria;
import edu.training.srp.main.info.ApplianceInfo;

public class SpeakersInfo implements ApplianceInfo {

    @Override
    public String info(Appliance appliance) {
        Speakers speakers = (Speakers) appliance;
        return speakers.getClass().getSimpleName() + ": " +
                SearchCriteria.Speakers.POWER_CONSUMPTION.toString() + "=" + speakers.getPowerConsumption() +
                ", " +
                SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString() + "=" + speakers.getNumberOfSpeakers() +
                ", " +
                SearchCriteria.Speakers.FREQUENCY_RANGE.toString() + "=" + speakers.getFrequencyRange() +
                ", " +
                SearchCriteria.Speakers.CORD_LENGTH.toString() + "=" + speakers.getCordLength();
    }
}

package edu.training.srp.entity.creator;

import edu.training.srp.entity.Appliance;
import edu.training.srp.entity.Speakers;

public class SpeakersCreator implements ApplianceCreator {

    @Override
    public Appliance create(String[] params) {
        return Speakers.builder()
                .setPowerConsumption(Integer.valueOf(params[0]))
                .setNumberOfSpeakers(Integer.valueOf(params[1]))
                .setFrequencyRange(params[2])
                .setCordLength(Integer.valueOf(params[3]))
                .build();
    }
}

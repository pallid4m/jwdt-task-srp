package edu.training.srp.entity.criteria.type;

import edu.training.srp.entity.criteria.SearchCriteria;

import java.util.HashMap;
import java.util.Map;

public final class SpeakersType implements ApplianceType {

    private final Map<String, Class<?>> speakersTypeRules = new HashMap<>();

    {
        speakersTypeRules.put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), Integer.class);
        speakersTypeRules.put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), Integer.class);
        speakersTypeRules.put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), String.class);
        speakersTypeRules.put(SearchCriteria.Speakers.CORD_LENGTH.toString(), Integer.class);
    }

    @Override
    public Map<String, Class<?>> getTypeRules() {
        return speakersTypeRules;
    }
}

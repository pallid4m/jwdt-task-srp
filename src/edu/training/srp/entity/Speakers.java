package edu.training.srp.entity;

import java.util.Objects;

public class Speakers implements Appliance {
    private final Integer powerConsumption;
    private final Integer numberOfSpeakers;
    private final String frequencyRange;
    private final Integer cordLength;

    private Speakers(Builder builder) {
        powerConsumption = builder.powerConsumption;
        numberOfSpeakers = builder.numberOfSpeakers;
        frequencyRange = builder.frequencyRange;
        cordLength = builder.cordLength;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public Integer getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public Integer getCordLength() {
        return cordLength;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Objects.equals(powerConsumption, speakers.powerConsumption) &&
                Objects.equals(numberOfSpeakers, speakers.numberOfSpeakers) &&
                Objects.equals(frequencyRange, speakers.frequencyRange) &&
                Objects.equals(cordLength, speakers.cordLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }

    public static class Builder {
        private Integer powerConsumption;
        private Integer numberOfSpeakers;
        private String frequencyRange;
        private Integer cordLength;

        public Builder setPowerConsumption(Integer powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setNumberOfSpeakers(Integer numberOfSpeakers) {
            this.numberOfSpeakers = numberOfSpeakers;
            return this;
        }

        public Builder setFrequencyRange(String frequencyRange) {
            this.frequencyRange = frequencyRange;
            return this;
        }

        public Builder setCordLength(Integer cordLength) {
            this.cordLength = cordLength;
            return this;
        }

        public Speakers build() {
            return new Speakers(this);
        }
    }
}

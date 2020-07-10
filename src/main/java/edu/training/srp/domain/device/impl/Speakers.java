package edu.training.srp.domain.device.impl;

import edu.training.srp.domain.device.Device;

import java.util.Objects;

public class Speakers implements Device {

    private Integer power_consumption;
    private Integer number_of_speakers;
    private String frequency_range;
    private Integer cord_length;

    public Speakers() {}

    public Speakers(String[] params) {
        power_consumption = Integer.valueOf(params[0]);
        number_of_speakers = Integer.valueOf(params[1]);
        frequency_range = params[2];
        cord_length = Integer.valueOf(params[3]);
    }

    public Speakers(Integer power_consumption, Integer number_of_speakers, String frequency_range, Integer cord_length) {
        this.power_consumption = power_consumption;
        this.number_of_speakers = number_of_speakers;
        this.frequency_range = frequency_range;
        this.cord_length = cord_length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Objects.equals(power_consumption, speakers.power_consumption) &&
                Objects.equals(number_of_speakers, speakers.number_of_speakers) &&
                Objects.equals(frequency_range, speakers.frequency_range) &&
                Objects.equals(cord_length, speakers.cord_length);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, number_of_speakers, frequency_range, cord_length);
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "power_consumption=" + power_consumption +
                ", number_of_speakers=" + number_of_speakers +
                ", frequency_range='" + frequency_range + '\'' +
                ", cord_length=" + cord_length +
                '}';
    }
}

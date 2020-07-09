package edu.training.srp.device.impl;

import edu.training.srp.device.Device;

public class Speakers implements Device {

//    Speakers : POWER_CONSUMPTION=15, NUMBER_OF_SPEAKERS=2, FREQUENCY_RANGE=2-4, CORD_LENGTH=2
//    Speakers : POWER_CONSUMPTION=20, NUMBER_OF_SPEAKERS=3, FREQUENCY_RANGE=3-4, CORD_LENGTH=3
//    Speakers : POWER_CONSUMPTION=17, NUMBER_OF_SPEAKERS=4, FREQUENCY_RANGE=2-3.5, CORD_LENGTH=4

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
    public String toString() {
        return "Speakers{" +
                "power_consumption=" + power_consumption +
                ", number_of_speakers=" + number_of_speakers +
                ", frequency_range='" + frequency_range + '\'' +
                ", cord_length=" + cord_length +
                '}';
    }
}

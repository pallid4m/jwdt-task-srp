package edu.training.srp.domain.device.impl;

import edu.training.srp.domain.device.Device;

import java.util.Objects;

public class VacuumCleaner implements Device {

    private Integer power_consumption;
    private String filter_type;
    private String bag_type;
    private String wand_type;
    private Integer motor_speed_regulation;
    private Integer cleaning_width;

    public VacuumCleaner() {}

    public VacuumCleaner(String[] params) {
        power_consumption = Integer.valueOf(params[0]);
        filter_type = params[1];
        bag_type = params[2];
        wand_type = params[3];
        motor_speed_regulation = Integer.valueOf(params[4]);
        cleaning_width = Integer.valueOf(params[5]);
    }

    public VacuumCleaner(Integer power_consumption, String filter_type, String bag_type, String wand_type, Integer motor_speed_regulation, Integer cleaning_width) {
        this.power_consumption = power_consumption;
        this.filter_type = filter_type;
        this.bag_type = bag_type;
        this.wand_type = wand_type;
        this.motor_speed_regulation = motor_speed_regulation;
        this.cleaning_width = cleaning_width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(power_consumption, that.power_consumption) &&
                Objects.equals(filter_type, that.filter_type) &&
                Objects.equals(bag_type, that.bag_type) &&
                Objects.equals(wand_type, that.wand_type) &&
                Objects.equals(motor_speed_regulation, that.motor_speed_regulation) &&
                Objects.equals(cleaning_width, that.cleaning_width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, filter_type, bag_type, wand_type, motor_speed_regulation, cleaning_width);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "power_consumption=" + power_consumption +
                ", filter_type='" + filter_type + '\'' +
                ", bag_type='" + bag_type + '\'' +
                ", wand_type='" + wand_type + '\'' +
                ", motor_speed_regulation=" + motor_speed_regulation +
                ", cleaning_width=" + cleaning_width +
                '}';
    }
}

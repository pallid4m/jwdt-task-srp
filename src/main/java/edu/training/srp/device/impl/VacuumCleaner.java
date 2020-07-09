package edu.training.srp.device.impl;

import edu.training.srp.device.Device;

public class VacuumCleaner implements Device {

//    VacuumCleaner : POWER_CONSUMPTION=100, FILTER_TYPE=A, BAG_TYPE=A2, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=3000, CLEANING_WIDTH=20
//    VacuumCleaner : POWER_CONSUMPTION=110, FILTER_TYPE=B, BAG_TYPE=AA-89, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=2900, CLEANING_WIDTH=25
//    VacuumCleaner : POWER_CONSUMPTION=90, FILTER_TYPE=C, BAG_TYPE=XX00, WAND_TYPE=all-in-one, MOTOR_SPEED_REGULATION=2950, CLEANING_WIDTH=30

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

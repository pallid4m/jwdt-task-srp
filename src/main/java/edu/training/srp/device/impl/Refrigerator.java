package edu.training.srp.device.impl;

import edu.training.srp.device.Device;

public class Refrigerator implements Device {

//    Refrigerator : POWER_CONSUMPTION=100, WEIGHT=20, FREEZER_CAPACITY=10, OVERALL_CAPACITY=300, HEIGHT=200, WIDTH=70
//    Refrigerator : POWER_CONSUMPTION=200, WEIGHT=30, FREEZER_CAPACITY=15, OVERALL_CAPACITY=300, HEIGHT=180, WIDTH=80
//    Refrigerator : POWER_CONSUMPTION=150, WEIGHT=35, FREEZER_CAPACITY=20, OVERALL_CAPACITY=350.5, HEIGHT=250, WIDTH=75

    private Integer power_consumption;
    private Integer weight;
    private Integer freezer_capacity;
    private Double overall_capacity;
    private Integer height;
    private Integer width;

    public Refrigerator() {}

    public Refrigerator(String[] params) {
        power_consumption = Integer.valueOf(params[0]);
        weight = Integer.valueOf(params[1]);
        freezer_capacity = Integer.valueOf(params[2]);
        overall_capacity = Double.valueOf(params[3]);
        height = Integer.valueOf(params[4]);
        width = Integer.valueOf(params[5]);
    }

    public Refrigerator(Integer power_consumption, Integer weight, Integer freezer_capacity, Double overall_capacity, Integer height, Integer width) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.freezer_capacity = freezer_capacity;
        this.overall_capacity = overall_capacity;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", freezer_capacity=" + freezer_capacity +
                ", overall_capacity=" + overall_capacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}

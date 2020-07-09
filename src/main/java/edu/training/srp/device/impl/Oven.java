package edu.training.srp.device.impl;

import edu.training.srp.device.Device;

public class Oven implements Device {

//    Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5
//    Oven : POWER_CONSUMPTION=1500, WEIGHT=12, CAPACITY=33, DEPTH=60, HEIGHT=45, WIDTH=68
//    Oven : POWER_CONSUMPTION=2000, WEIGHT=11, CAPACITY=33, DEPTH=60, HEIGHT=40, WIDTH=70

    private Integer power_consumption;
    private Integer weight;
    private Integer capacity;
    private Integer depth;
    private Double height;
    private Double width;

    public Oven() {}

    public Oven(String[] params) {
        power_consumption = Integer.valueOf(params[0]);
        weight = Integer.valueOf(params[1]);
        capacity = Integer.valueOf(params[2]);
        depth = Integer.valueOf(params[3]);
        height = Double.valueOf(params[4]);
        width = Double.valueOf(params[5]);
    }

    public Oven(Integer power_consumption, Integer weight, Integer capacity, Integer depth, Double height, Double width) {
        this.power_consumption = power_consumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "power_consumption=" + power_consumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}

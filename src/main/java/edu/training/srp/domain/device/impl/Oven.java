package edu.training.srp.domain.device.impl;

import edu.training.srp.domain.device.Device;

import java.util.Objects;

public class Oven implements Device {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Objects.equals(power_consumption, oven.power_consumption) &&
                Objects.equals(weight, oven.weight) &&
                Objects.equals(capacity, oven.capacity) &&
                Objects.equals(depth, oven.depth) &&
                Objects.equals(height, oven.height) &&
                Objects.equals(width, oven.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, weight, capacity, depth, height, width);
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

package edu.training.srp.domain.device.impl;

import edu.training.srp.domain.device.Device;

import java.util.Objects;

public class Refrigerator implements Device {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(power_consumption, that.power_consumption) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(freezer_capacity, that.freezer_capacity) &&
                Objects.equals(overall_capacity, that.overall_capacity) &&
                Objects.equals(height, that.height) &&
                Objects.equals(width, that.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power_consumption, weight, freezer_capacity, overall_capacity, height, width);
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

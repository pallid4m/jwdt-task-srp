package edu.training.srp.entity;

import java.util.Objects;

public class Oven extends Appliance {

    private Integer powerConsumption;
    private Integer weight;
    private Integer capacity;
    private Integer depth;
    private Double height;
    private Double width;

    public Oven() {}

    public Oven(Integer powerConsumption, Integer weight, Integer capacity, Integer depth, Double height, Double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public Integer getDepth() {
        return depth;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Objects.equals(powerConsumption, oven.powerConsumption) &&
                Objects.equals(weight, oven.weight) &&
                Objects.equals(capacity, oven.capacity) &&
                Objects.equals(depth, oven.depth) &&
                Objects.equals(height, oven.height) &&
                Objects.equals(width, oven.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }

    @Override
    public String toString() {
        return "Oven{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public Oven(Builder builder) {
        powerConsumption = builder.powerConsumption;
        weight = builder.weight;
        capacity = builder.capacity;
        depth = builder.depth;
        height = builder.height;
        width = builder.width;
    }

    public static class Builder {
        private Integer powerConsumption;
        private Integer weight;
        private Integer capacity;
        private Integer depth;
        private Double height;
        private Double width;

        public Builder setPowerConsumption(Integer powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public Builder setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }

        public Builder setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }

        public Builder setHeight(Double height) {
            this.height = height;
            return this;
        }

        public Builder setWidth(Double width) {
            this.width = width;
            return this;
        }

        public Oven build() {
            return new Oven(this);
        }
    }
}

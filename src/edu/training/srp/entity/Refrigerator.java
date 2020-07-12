package edu.training.srp.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

    private Integer powerConsumption;
    private Integer weight;
    private Integer freezerCapacity;
    private Double overallCapacity;
    private Integer height;
    private Integer width;

    public Refrigerator() {}

    public Refrigerator(Integer powerConsumption, Integer weight, Integer freezerCapacity, Double overallCapacity, Integer height, Integer width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getFreezerCapacity() {
        return freezerCapacity;
    }

    public Double getOverallCapacity() {
        return overallCapacity;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Refrigerator that = (Refrigerator) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(freezerCapacity, that.freezerCapacity) &&
                Objects.equals(overallCapacity, that.overallCapacity) &&
                Objects.equals(height, that.height) &&
                Objects.equals(width, that.width);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "powerConsumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezerCapacity=" + freezerCapacity +
                ", overallCapacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public Refrigerator(Builder builder) {
        powerConsumption = builder.powerConsumption;
        weight = builder.weight;
        freezerCapacity = builder.freezerCapacity;
        overallCapacity = builder.overallCapacity;
        height = builder.height;
        width = builder.width;
    }

    public static class Builder {
        private Integer powerConsumption;
        private Integer weight;
        private Integer freezerCapacity;
        private Double overallCapacity;
        private Integer height;
        private Integer width;

        public Builder setPowerConsumption(Integer powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }

        public Builder setFreezerCapacity(Integer freezerCapacity) {
            this.freezerCapacity = freezerCapacity;
            return this;
        }

        public Builder setOverallCapacity(Double overallCapacity) {
            this.overallCapacity = overallCapacity;
            return this;
        }

        public Builder setHeight(Integer height) {
            this.height = height;
            return this;
        }

        public Builder setWidth(Integer width) {
            this.width = width;
            return this;
        }

        public Refrigerator build() {
            return new Refrigerator(this);
        }
    }
}

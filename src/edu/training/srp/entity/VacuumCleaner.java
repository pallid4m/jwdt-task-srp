package edu.training.srp.entity;

import java.util.Objects;

public class VacuumCleaner implements Appliance {
    private final Integer powerConsumption;
    private final String filterType;
    private final String bagType;
    private final String wandType;
    private final Integer motorSpeedRegulation;
    private final Integer cleaningWidth;

    private VacuumCleaner(Builder builder) {
        powerConsumption = builder.powerConsumption;
        filterType = builder.filterType;
        bagType = builder.bagType;
        wandType = builder.wandType;
        motorSpeedRegulation = builder.motorSpeedRegulation;
        cleaningWidth = builder.cleaningWidth;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public Integer getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public Integer getCleaningWidth() {
        return cleaningWidth;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(powerConsumption, that.powerConsumption) &&
                Objects.equals(filterType, that.filterType) &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandType, that.wandType) &&
                Objects.equals(motorSpeedRegulation, that.motorSpeedRegulation) &&
                Objects.equals(cleaningWidth, that.cleaningWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "powerConsumption=" + powerConsumption +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }

    public static class Builder {
        private Integer powerConsumption;
        private String filterType;
        private String bagType;
        private String wandType;
        private Integer motorSpeedRegulation;
        private Integer cleaningWidth;

        public Builder setPowerConsumption(Integer powerConsumption) {
            this.powerConsumption = powerConsumption;
            return this;
        }

        public Builder setFilterType(String filterType) {
            this.filterType = filterType;
            return this;
        }

        public Builder setBagType(String bagType) {
            this.bagType = bagType;
            return this;
        }

        public Builder setWandType(String wandType) {
            this.wandType = wandType;
            return this;
        }

        public Builder setMotorSpeedRegulation(Integer motorSpeedRegulation) {
            this.motorSpeedRegulation = motorSpeedRegulation;
            return this;
        }

        public Builder setCleaningWidth(Integer cleaningWidth) {
            this.cleaningWidth = cleaningWidth;
            return this;
        }

        public VacuumCleaner build() {
            return new VacuumCleaner(this);
        }
    }
}

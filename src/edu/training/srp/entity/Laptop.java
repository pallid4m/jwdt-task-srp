package edu.training.srp.entity;

import java.util.Objects;

public class Laptop {
    private final Double batteryCapacity;
    private final String os;
    private final Integer memoryRom;
    private final Integer systemMemory;
    private final Double cpu;
    private final Integer displayInchs;

    private Laptop(Builder builder) {
        batteryCapacity = builder.batteryCapacity;
        os = builder.os;
        memoryRom = builder.memoryRom;
        systemMemory = builder.systemMemory;
        cpu = builder.cpu;
        displayInchs = builder.displayInchs;
    }

    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public Integer getMemoryRom() {
        return memoryRom;
    }

    public Integer getSystemMemory() {
        return systemMemory;
    }

    public Double getCpu() {
        return cpu;
    }

    public Integer getDisplayInchs() {
        return displayInchs;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(batteryCapacity, laptop.batteryCapacity) &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(memoryRom, laptop.memoryRom) &&
                Objects.equals(systemMemory, laptop.systemMemory) &&
                Objects.equals(cpu, laptop.cpu) &&
                Objects.equals(displayInchs, laptop.displayInchs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memoryRom=" + memoryRom +
                ", systemMemory=" + systemMemory +
                ", cpu=" + cpu +
                ", displayInchs=" + displayInchs +
                '}';
    }

    public static class Builder {
        private Double batteryCapacity;
        private String os;
        private Integer memoryRom;
        private Integer systemMemory;
        private Double cpu;
        private Integer displayInchs;

        public Builder setBatteryCapacity(Double batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder setOs(String os) {
            this.os = os;
            return this;
        }

        public Builder setMemoryRom(Integer memoryRom) {
            this.memoryRom = memoryRom;
            return this;
        }

        public Builder setSystemMemory(Integer systemMemory) {
            this.systemMemory = systemMemory;
            return this;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setDisplayInchs(Integer displayInchs) {
            this.displayInchs = displayInchs;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }
}

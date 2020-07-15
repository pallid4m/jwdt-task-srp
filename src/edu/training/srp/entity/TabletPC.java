package edu.training.srp.entity;

import java.util.Objects;

public class TabletPC {
    private final Integer batteryCapacity;
    private final Integer displayInches;
    private final Integer memoryRom;
    private final Integer flashMemoryCapacity;
    private final String color;

    private TabletPC(Builder builder) {
        batteryCapacity = builder.batteryCapacity;
        displayInches = builder.displayInches;
        memoryRom = builder.memoryRom;
        flashMemoryCapacity = builder.flashMemoryCapacity;
        color = builder.color;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public Integer getDisplayInches() {
        return displayInches;
    }

    public Integer getMemoryRom() {
        return memoryRom;
    }

    public Integer getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(batteryCapacity, tabletPC.batteryCapacity) &&
                Objects.equals(displayInches, tabletPC.displayInches) &&
                Objects.equals(memoryRom, tabletPC.memoryRom) &&
                Objects.equals(flashMemoryCapacity, tabletPC.flashMemoryCapacity) &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom +
                ", flashMemoryCapacity=" + flashMemoryCapacity +
                ", color='" + color + '\'' +
                '}';
    }

    public static class Builder {
        private Integer batteryCapacity;
        private Integer displayInches;
        private Integer memoryRom;
        private Integer flashMemoryCapacity;
        private String color;

        public Builder setBatteryCapacity(Integer batteryCapacity) {
            this.batteryCapacity = batteryCapacity;
            return this;
        }

        public Builder setDisplayInches(Integer displayInches) {
            this.displayInches = displayInches;
            return this;
        }

        public Builder setMemoryRom(Integer memoryRom) {
            this.memoryRom = memoryRom;
            return this;
        }

        public Builder setFlashMemoryCapacity(Integer flashMemoryCapacity) {
            this.flashMemoryCapacity = flashMemoryCapacity;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public TabletPC build() {
            return new TabletPC(this);
        }
    }
}

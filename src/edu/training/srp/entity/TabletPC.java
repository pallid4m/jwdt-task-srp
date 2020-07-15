package edu.training.srp.entity;

import java.util.Objects;

public class TabletPC extends Appliance {

    private Integer batteryCapacity;
    private Integer displayInches;
    private Integer memoryRom;
    private Integer flashMemoryCapacity;
    private String color;

    public TabletPC() {}

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(Integer displayInches) {
        this.displayInches = displayInches;
    }

    public Integer getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(Integer memoryRom) {
        this.memoryRom = memoryRom;
    }

    public Integer getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(Integer flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public static Builder builder() {
        return new Builder();
    }

    public TabletPC(Builder builder) {
        batteryCapacity = builder.batteryCapacity;
        displayInches = builder.displayInches;
        memoryRom = builder.memoryRom;
        flashMemoryCapacity = builder.flashMemoryCapacity;
        color = builder.color;
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

package edu.training.srp.domain.device.impl;

import edu.training.srp.domain.device.Device;

import java.util.Objects;

public class TabletPC implements Device {

    private Integer battery_capacity;
    private Integer display_inches;
    private Integer memory_rom;
    private Integer flash_memory_capacity;
    private String color;

    public TabletPC() {}

    public TabletPC(String[] params) {
        battery_capacity = Integer.valueOf(params[0]);
        display_inches = Integer.valueOf(params[1]);
        memory_rom = Integer.valueOf(params[2]);
        flash_memory_capacity = Integer.valueOf(params[3]);
        color = params[4];
    }

    public TabletPC(Integer battery_capacity, Integer display_inches, Integer memory_rom, Integer flash_memory_capacity, String color) {
        this.battery_capacity = battery_capacity;
        this.display_inches = display_inches;
        this.memory_rom = memory_rom;
        this.flash_memory_capacity = flash_memory_capacity;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Objects.equals(battery_capacity, tabletPC.battery_capacity) &&
                Objects.equals(display_inches, tabletPC.display_inches) &&
                Objects.equals(memory_rom, tabletPC.memory_rom) &&
                Objects.equals(flash_memory_capacity, tabletPC.flash_memory_capacity) &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery_capacity, display_inches, memory_rom, flash_memory_capacity, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" +
                "battery_capacity=" + battery_capacity +
                ", display_inches=" + display_inches +
                ", memory_rom=" + memory_rom +
                ", flash_memory_capacity=" + flash_memory_capacity +
                ", color='" + color + '\'' +
                '}';
    }
}

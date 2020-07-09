package edu.training.srp.device.impl;

import edu.training.srp.device.Device;

public class TabletPC implements Device {

//    TabletPC : BATTERY_CAPACITY=3, DISPLAY_INCHES=14, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=2, COLOR=blue
//    TabletPC : BATTERY_CAPACITY=4, DISPLAY_INCHES=15, MEMORY_ROM=8000, FLASH_MEMORY_CAPACITY=6, COLOR=red
//    TabletPC : BATTERY_CAPACITY=5, DISPLAY_INCHES=16, MEMORY_ROM=16000, FLASH_MEMORY_CAPACITY=8, COLOR=green

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

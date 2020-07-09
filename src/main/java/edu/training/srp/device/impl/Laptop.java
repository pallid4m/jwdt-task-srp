package edu.training.srp.device.impl;

import edu.training.srp.device.Device;

public class Laptop implements Device {

//    Laptop : BATTERY_CAPACITY=1, OS=Windows, MEMORY_ROM=4000, SYSTEM_MEMORY=1000, CPU=1.2, DISPLAY_INCHS=18
//    Laptop : BATTERY_CAPACITY=1.5, OS=Linux, MEMORY_ROM=8000, SYSTEM_MEMORY=1000, CPU=2.2, DISPLAY_INCHS=19
//    Laptop : BATTERY_CAPACITY=3, OS=Windows, MEMORY_ROM=8000, SYSTEM_MEMORY=1500, CPU=3.2, DISPLAY_INCHS=22

    private Double battery_capacity;
    private String os;
    private Integer memory_rom;
    private Integer system_memory;
    private Double cpu;
    private Integer display_inchs;

    public Laptop() {}

    public Laptop(String[] params) {
        battery_capacity = Double.valueOf(params[0]);
        os = params[1];
        memory_rom = Integer.valueOf(params[2]);
        system_memory = Integer.valueOf(params[3]);
        cpu = Double.valueOf(params[4]);
        display_inchs = Integer.valueOf(params[5]);
    }

    public Laptop(Double battery_capacity, String os, Integer memory_rom, Integer system_memory, Double cpu, Integer display_inchs) {
        this.battery_capacity = battery_capacity;
        this.os = os;
        this.memory_rom = memory_rom;
        this.system_memory = system_memory;
        this.cpu = cpu;
        this.display_inchs = display_inchs;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery_capacity=" + battery_capacity +
                ", os='" + os + '\'' +
                ", memory_rom=" + memory_rom +
                ", system_memory=" + system_memory +
                ", cpu=" + cpu +
                ", display_inchs=" + display_inchs +
                '}';
    }
}

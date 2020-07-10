package edu.training.srp.domain.device.impl;

import edu.training.srp.domain.device.Device;

import java.util.Objects;

public class Laptop implements Device {

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(battery_capacity, laptop.battery_capacity) &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(memory_rom, laptop.memory_rom) &&
                Objects.equals(system_memory, laptop.system_memory) &&
                Objects.equals(cpu, laptop.cpu) &&
                Objects.equals(display_inchs, laptop.display_inchs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery_capacity, os, memory_rom, system_memory, cpu, display_inchs);
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

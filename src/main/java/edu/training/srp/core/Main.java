package edu.training.srp.core;

import edu.training.srp.domain.device.Device;
import edu.training.srp.service.DeviceService;
import edu.training.srp.service.impl.DeviceFileService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String deviceName = "refrigerator";
        String paramName = "overall_capacity";
        String paramValue = "300";

        DeviceService deviceService = new DeviceFileService();
        List<Device> deviceList = deviceService.findDevicesByParam(deviceName, paramName, paramValue);
        deviceList.forEach(System.out::println);
    }
}

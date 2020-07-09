package edu.training.srp;

import edu.training.srp.device.Device;
import edu.training.srp.device.DeviceFileRepository;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String deviceName = "refrigerator";
        String paramName = "OVERALL_CAPACITY";
        String paramValue = "300";

        DeviceFileRepository repository = new DeviceFileRepository();

        List<Device> deviceList = repository.findDevices(deviceName, paramName, paramValue);
        deviceList.forEach(System.out::println);
    }
}

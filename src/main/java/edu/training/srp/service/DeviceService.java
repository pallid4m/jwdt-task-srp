package edu.training.srp.service;

import edu.training.srp.domain.device.Device;

import java.util.List;

public interface DeviceService {
    List<Device> findDevicesByParam(String deviceName, String paramName, String paramValue);
}

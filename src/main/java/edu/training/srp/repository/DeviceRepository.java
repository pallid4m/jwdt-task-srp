package edu.training.srp.repository;

import edu.training.srp.domain.device.Device;

import java.util.List;

public interface DeviceRepository {
    List<Device> findDevicesByParam(String deviceName, String paramName, String paramValue);
}

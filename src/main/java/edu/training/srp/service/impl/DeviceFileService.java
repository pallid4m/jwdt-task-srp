package edu.training.srp.service.impl;

import edu.training.srp.domain.device.Device;
import edu.training.srp.repository.DeviceRepository;
import edu.training.srp.repository.impl.DeviceFileRepository;
import edu.training.srp.service.DeviceService;

import java.util.List;

public class DeviceFileService implements DeviceService {

    private final DeviceRepository deviceRepository = new DeviceFileRepository();

    @Override
    public List<Device> findDevicesByParam(String deviceName, String paramName, String paramValue) {
        return deviceRepository.findDevicesByParam(deviceName, paramName, paramValue);
    }
}

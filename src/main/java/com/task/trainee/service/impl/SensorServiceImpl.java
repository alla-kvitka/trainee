package com.task.trainee.service.impl;

import com.task.trainee.model.Sensor;
import com.task.trainee.model.SensorStatus;
import com.task.trainee.service.SensorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorServiceImpl implements SensorService {
    @Override
    public List<Sensor> getAll(String type, int batteryPercentageMin, SensorStatus sensorStatus) {
        return null;
    }
}

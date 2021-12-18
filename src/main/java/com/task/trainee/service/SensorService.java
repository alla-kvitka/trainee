package com.task.trainee.service;


import com.task.trainee.model.Sensor;
import com.task.trainee.model.SensorStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SensorService {
    List<Sensor> getAll(String type, int batteryPercentageMin, SensorStatus sensorStatus);
}

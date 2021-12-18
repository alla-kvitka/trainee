package com.task.trainee.service;


import com.task.trainee.model.Sensor;
import com.task.trainee.model.SensorStatus;

import java.util.List;

public interface SensorService {
    List<Sensor> getAll(String type, int batteryPercentageMin, SensorStatus sensorStatus);
}

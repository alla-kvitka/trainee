package com.task.trainee.api;

import com.task.trainee.model.Sensor;
import com.task.trainee.model.SensorStatus;

import java.util.List;


public interface SensorApi {
    List<Sensor> readSensors(String type, int batteryPercentageMin, SensorStatus sensorStatus);

}

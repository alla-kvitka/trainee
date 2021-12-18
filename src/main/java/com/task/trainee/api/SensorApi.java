package com.task.trainee.api;

import com.task.trainee.model.Sensor;
import com.task.trainee.model.SensorStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api")
public interface SensorApi {
    @GetMapping("/sensor")
    List<Sensor> readSensors(String type, Integer batteryPercentageMin, SensorStatus sensorStatus);

}

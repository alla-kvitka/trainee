package com.task.trainee.api.impl;

import com.task.trainee.api.SensorApi;
import com.task.trainee.model.Sensor;
import com.task.trainee.model.SensorStatus;
import com.task.trainee.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class SensorApiImpl implements SensorApi {
    private final SensorService sensorService;

    @Override
    public List<Sensor> readSensors(String type, int batteryPercentageMin, SensorStatus sensorStatus) {
        return sensorService.getAll(type, batteryPercentageMin, sensorStatus);
    }
}

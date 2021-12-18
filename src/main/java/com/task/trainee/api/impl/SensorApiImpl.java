package com.task.trainee.api.impl;

import com.task.trainee.api.SensorApi;
import com.task.trainee.model.Sensor;
import com.task.trainee.model.SensorStatus;
import com.task.trainee.service.SensorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SensorApiImpl implements SensorApi {

    private final SensorService sensorService;

    @Override
    public List<Sensor> readSensors(@RequestParam(required = false) String type,
                                    @RequestParam(required = false) Integer batteryPercentageMin,
                                    @RequestParam(required = false) SensorStatus sensorStatus) {
        return sensorService.getAll(type, batteryPercentageMin, sensorStatus);
    }
}

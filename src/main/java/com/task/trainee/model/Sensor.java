package com.task.trainee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sensor {
    private String id;
    private String name;
    private String description;
    private String type;
    private int batteryPercentage;
    private SensorStatus sensorStatus;
    private long modifiedTime;
    private String modifiedBy;
    private long createdTime;
    private String createdBy;
}
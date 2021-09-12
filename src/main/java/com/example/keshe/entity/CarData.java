package com.example.keshe.entity;

import lombok.Data;

@Data
public class CarData {
    private int groupId;
    private int leftWheelSpeed;
    private int rightWheelSpeed;
    private int xAcceleration;
    private int yAcceleration;
    private int zAcceleration;
    private int xGyroscope;
    private int yGyroscope;
    private int zGyroscope;
    private int xMagnetometer;
    private int yMagnetometer;
    private int zMagnetometer;
    private int adc1;
    private int adc2;
    private int adc3;
    private int decentering;
    private int aorc;
    private int lPwm;
    private int rPwm;
    private int xUnknow;
    private int yUnknow;
    private int zUnknow;
    private int circle;

}

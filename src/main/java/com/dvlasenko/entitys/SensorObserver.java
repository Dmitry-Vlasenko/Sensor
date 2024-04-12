package com.dvlasenko.entitys;

import com.dvlasenko.interfaces.ISensorObserver;
import com.dvlasenko.models.Calculate;

public class SensorObserver implements ISensorObserver {
    private double temperature;
    private String color;
    private double weight;

    public SensorObserver() {
    }

    public void update(double temperature) {
        Calculate calculate = new Calculate();
        String color = calculate.calculateColor(temperature);
        double weight = calculate.calculateWeight(temperature);
        this.temperature = temperature;
        this.color = color;
        this.weight = weight;
    }
    public SensorObserver getSensorObserver() {
        return this;
    }
    public double getTemperature() {
        return this.temperature;
    }
    public String getColor() {
        return this.color;
    }
    public double getWeight() {
        return this.weight;
    }
}


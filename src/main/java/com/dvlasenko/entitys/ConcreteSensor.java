package com.dvlasenko.entitys;

import com.dvlasenko.interfaces.ISensor;
import com.dvlasenko.interfaces.ISensorObserver;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSensor implements ISensor {
    private double temperature;
    private double weight;
    private String color;
    private List<ISensorObserver> observers = new ArrayList<>();

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        notifySensorObservers();
    }

    public void setWeight(int weight) {
        this.weight = weight;
        notifySensorObservers();
    }

    public void setColor(String color) {
        this.color = color;
        notifySensorObservers();
    }

    @Override
    public void addSensorObserver(ISensorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeSensorObserver(ISensorObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySensorObservers() {
        for (ISensorObserver observer : observers) {
            observer.update(temperature);
        }
    }
}

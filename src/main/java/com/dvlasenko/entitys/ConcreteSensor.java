package com.dvlasenko.entitys;

import com.dvlasenko.interfaces.ISensor;
import com.dvlasenko.interfaces.ISensorObserver;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSensor implements ISensor {
    private double temperature;
    private final List<ISensorObserver> observers = new ArrayList<>();

    public void setTemperature(double temperature) {
        this.temperature = temperature;
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

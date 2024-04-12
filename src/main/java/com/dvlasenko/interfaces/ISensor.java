package com.dvlasenko.interfaces;

public interface ISensor {
    void addSensorObserver(ISensorObserver observer);
    void removeSensorObserver(ISensorObserver observer);
    void notifySensorObservers();
}

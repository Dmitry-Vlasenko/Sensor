package com.dvlasenko;

import com.dvlasenko.controllers.SensorControllers;

public class Main {
    private final SensorControllers App = new SensorControllers();

    public static void main(String[] args) {

        new Main().run();
    }

    public void run() {
        App.sensorProcessing();
    }
}
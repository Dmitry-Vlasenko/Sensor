package com.dvlasenko;

import com.dvlasenko.controllers.sensorControllers;

public class Main {
    private final sensorControllers App = new sensorControllers();

    public static void main(String[] args) {

        new Main().run();
    }

    public void run() {
        App.sensorProcessing();
    }
}
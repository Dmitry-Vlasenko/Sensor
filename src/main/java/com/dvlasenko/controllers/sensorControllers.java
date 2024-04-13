package com.dvlasenko.controllers;

import com.dvlasenko.entitys.ConcreteSensor;
import com.dvlasenko.entitys.SensorObserver;

import java.util.Scanner;

public class sensorControllers {
    public void sensorProcessing() {
        Scanner scanner = new Scanner(System.in);
        ConcreteSensor sensor = new ConcreteSensor();
        SensorObserver sensorObserver = new SensorObserver();
        sensor.addSensorObserver(sensorObserver);
        String menu = "1. Set current temperature \n2. Exit";
        while (true) {
            System.out.println(menu);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter current temperature: ");
                    double temperature = scanner.nextDouble();
                    sensor.setTemperature(temperature);
                    sensor.notifySensorObservers();
                    System.out.println("Temperature: " + sensorObserver.getTemperature() + "°C, Weight: " + sensorObserver.getWeight() + "g, Color: " + sensorObserver.getColor());
                    break;
                case 2:
                    System.out.println("Exit");
                    scanner.close();
                    sensor.removeSensorObserver(sensorObserver);
                    System.exit(0);
            }
        }
    }
}

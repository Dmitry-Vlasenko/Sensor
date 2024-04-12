package com.dvlasenko.models;

public class Calculate {
    public String calculateColor(double temperature) {
        String color = "WHITE";
        if (temperature <= 0) {
            color = "WHITE";
        } else {
            color = "BLACK";
            return color;
        }
        return color;
    }
    public double calculateWeight(double temperature) {
        double weight = 1;
        if (temperature > 0) {
            weight = temperature *2.0;
        }
        return weight;
    }
}

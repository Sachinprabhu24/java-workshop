package com.vetias.java.workshop.tempdata.beans;
public class TemperatureSensor implements Sensor {
    private final  float temperature;

    public TemperatureSensor(float atemperature) {
        temperature = atemperature;
    }
    public float getReading() {
        return temperature;
    }
}

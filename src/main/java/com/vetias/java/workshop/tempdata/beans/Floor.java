package com.vetias.java.workshop.tempdata.beans;

import java.util.Objects;

public class Floor{
    private int floorName;
    private double number;
    private Zone[] zones;

    public Floor(int floorName, double number) {
        this.floorName = floorName;
        this.number = number;
    }

    public Floor(Zone[] zones) {
        this.zones = zones;
    }
    public Zone[] getZones() {
        Zone[] zones = null;
        return zones;
    }

    public void setZones(Zone[] zones) {
        this.zones = zones;
    }

    public int getFloorName() {
        return floorName;
    }

    public double getNumber() {
        return number;
    }

    public void setFloorName(int floorName) {
        this.floorName = floorName;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

    Floor floor = (Floor) o;
    return floorName == floor.floorName &&
            Double.compare(floor.number, number) == 0;
    }
    @Override
    public int hashCode() {
        return Objects.hash(floorName, number);
    }
}
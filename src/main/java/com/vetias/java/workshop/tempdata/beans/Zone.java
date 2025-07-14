package com.vetias.java.workshop.tempdata.beans;

public class Zone{
    private String name;
    private String zoneID;
    private String type;
    private double area;
    private String description;
    private Zone[] zonesList;

    public Zone(String name, String zoneID, String type, double area, String description) {
        this.name = name;
        this.zoneID = zoneID;
        this.type = type;
        this.area = area;
        this.description = description;
    }

    public Zone[] getZonesList() {
        return zonesList;
    }

    public void setZonesList(Zone[] zonesList) {
        this.zonesList = zonesList;
    }

    public String getName() {
        return name;
    }

    public String getZoneID() {
        return zoneID;
    }

    public String getType() {
        return type;
    }

    public double getArea() {
        return area;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setZoneID(String zoneID) {
        this.zoneID = zoneID;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString() {
        return "Zone{" +
                "name='" + name + '\'' +
                ", zoneID='" + zoneID + '\'' +
                ", type='" + type + '\'' +
                ", area=" + area +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zone zone = (Zone) o;

        if (Double.compare(zone.area, area) != 0) return false;
        if (!name.equals(zone.name)) return false;
        if (!zoneID.equals(zone.zoneID)) return false;
        if (!type.equals(zone.type)) return false;
        return description.equals(zone.description);
    }

    @Override
    public int hashCode() { 
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + zoneID.hashCode();
        result = 31 * result + type.hashCode();
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + description.hashCode();
        return result;
    }
}
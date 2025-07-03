public class Sensor {
    private String sensorID;
    private String name;
    private double temperature;

    public Sensor(String sensorID, String name, double temperature) {
        this.sensorID = sensorID;
        this.name = name;
        this.temperature = temperature;
    }

    public String getSensorID() {
        return sensorID;
    }

    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setSensorID(String sensorID) {
        this.sensorID = sensorID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
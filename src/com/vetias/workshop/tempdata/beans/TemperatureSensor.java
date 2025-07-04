public class TemperatureSensor implements Sensor {
    private float temperature;

    public TemperatureSensor(float atemperature) {
        temperature = atemperature;
    }
    public float getReading() {
        return temperature;
    }
}

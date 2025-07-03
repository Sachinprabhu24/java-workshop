public class Zone{
    private String name;
    private String ZoneID;
    private String Type;
    private double area;
    private String description;

    public Zone(String name, String zoneID, String type, double area, String description) {
        this.name = name;
        this.zoneID = zoneID;
        this.type = type;
        this.area = area;
        this.description = description;
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
}
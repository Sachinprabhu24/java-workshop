public class Floor{
    private int floorName;
    private double number;

    public Floor(int floorName, double number) {
        this.floorName = floorName;
        this.number = number;
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
}
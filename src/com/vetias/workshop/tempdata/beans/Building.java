import java.time.LocalDateTime;

public class Building{
    private String name;
    private double  area;
    private int floors;
    private LocalDateTime openingHours;
    private LocalDateTime closingHours;

    public Building(String name, double area, int floors, LocalDateTime openingHours, LocalDateTime closingHours) {
        this.name = name;
        this.area = area;
        this.floors = floors;
        this.openingHours = openingHours;
        this.closingHours = closingHours;
    }
    public String getName() {
        return name;
    }
    public double getArea() {
        return area;
    }
    public int getFloors() {
        return floors;
    }
    public double getOpeningHours() {
        return openingHours;
    }
    public double getClosingHours() {
        return closingHours;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setOpeningHours(double openingHours) {
        this.openingHours = openingHours;
    }
    public void setClosingHours(double closingHours) {
        this.closingHours = closingHours;
    }

    public void PrintDetails() {
        System.out.println("Building Name: " + name);
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Number of Floors: " + floors);
        System.out.println("Opening Hours: " + openingHours);
        System.out.println("Closing Hours: " + closingHours);
    }
}
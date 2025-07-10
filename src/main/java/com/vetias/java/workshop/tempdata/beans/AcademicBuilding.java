package main.com.java.vetias.workshop.tempdata.beans;

import java.util.Objects;

public class AcademicBuilding extends Building{
    private boolean hasLibraryOpen;
    private boolean isAuditoriumOpen;

    public AcademicBuilding(String name, double area, int floors, java.time.LocalDateTime openTime, java.time.LocalDateTime closeTime, boolean hasLibraryOpen, boolean isAuditoriumOpen) {
        super(name, area, floors, openTime, closeTime);
        this.hasLibraryOpen = hasLibraryOpen;
        this.isAuditoriumOpen = isAuditoriumOpen;
    }
    public boolean hasLibraryOpen() {
        return hasLibraryOpen;
    }
    public boolean isAuditoriumOpen() {
        return isAuditoriumOpen;
    }
    public void setHasLibraryOpen(boolean hasLibraryOpen) {
        this.hasLibraryOpen = hasLibraryOpen;
    }
    public void setIsAuditoriumOpen(boolean isAuditoriumOpen) {
        this.isAuditoriumOpen = isAuditoriumOpen;
    }
    public void displayAcademicBuildingInfo() {
        super.PrintDetails();
        System.out.println("Has Library open: " + (hasLibraryOpen ? "Yes" : "No"));
        System.out.println("Is Auditorium open: " + (isAuditoriumOpen ? "Yes" : "No"));
    }
     @Override
    public String toString() {
        return "AcademicBuilding{" +
                "hasLibraryOpen=" + hasLibraryOpen +
                ", isAuditoriumOpen=" + isAuditoriumOpen +
                ", " + super.toString() +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!super.equals(o)) return false;

        AcademicBuilding that = (AcademicBuilding) o;

        if (hasLibraryOpen != that.hasLibraryOpen) return false;
        return isAuditoriumOpen == that.isAuditoriumOpen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasLibraryOpen, isAuditoriumOpen, super.hashCode());
    }
}
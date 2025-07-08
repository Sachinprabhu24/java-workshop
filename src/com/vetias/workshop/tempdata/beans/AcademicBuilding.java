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
}
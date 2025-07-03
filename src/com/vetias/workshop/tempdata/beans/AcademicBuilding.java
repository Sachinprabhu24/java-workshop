public class AcademicBuilding extends Building{
    private boolean hasLibraryOpen;
    private boolean isAuditoriumOpen;

    public AcademicBuilding(boolean hasLibraryOpen, boolean isAuditoriumOpen) {
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
        System.out.println("Has Library: " + (hasLibraryOpen ? "Yes" : "No"));
        System.out.println("Is Auditorium Open: " + (isAuditoriumOpen ? "Yes" : "No"));
    }
}
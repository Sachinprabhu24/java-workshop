public class Hostel extends Building {
    private int numberOfRooms;
    private boolean isMessOpen;

    public Hostel(int numberOfRooms, boolean isMessOpen) {
        this.numberOfRooms = numberOfRooms;
        this.isMessOpen = isMessOpen;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isMessOpen() {
        return isMessOpen;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void setMessOpen(boolean messOpen) {
        isMessOpen = messOpen;
    }
    @Override
    public void displayHostelInfo() {
        super.PrintDetails();
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Is Mess Open: " + (isMessOpen ? "Yes" : "No"));
    }
}

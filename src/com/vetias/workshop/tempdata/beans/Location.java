public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String address;
    private String postalCode;
    private String contact;

    public Location(String name, double latitude, double longitude, String address, String postalCode, String contact) {
        this.name = setName(name);
        this.latitude = setLatitude(latitude);
        this.longitude = setLongitude(longitude);
        this.address = setAddress(address);
        this.postalCode = setPostalCode(postalCode);
        this.contact = setContact(contact);
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getAddress() {
        return address;
    }

    public String 
    public String getPostalCode() {
        return postalCode;
    }

    public String getContact() {
        return contact;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    
}
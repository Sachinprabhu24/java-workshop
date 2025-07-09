public class Location {
    private String name;
    private double latitude;
    private double longitude;
    private String address;
    private String postalCode;
    private String contact;

    public Location(String name, double latitude, double longitude, String address, String postalCode, String contact) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.address = address;
        this.postalCode = postalCode;
        this.contact = contact;
    }
    public Building[] getBuilding() {
        return building;
    }

    public void setBuilding(Building[] building) {
        this.building = building;
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
    @Override
    public String toString(){
        return "location{Name: " + name + 
        ",Latitude: "+latitude+
        ",Longitude :" + longitude+ 
        ",Address: "+address+
        ",PostalCode : "+postalCode+
        ",Contact: "+contact+
        "}";
    }
    @Override
    public String toString(){
        return "Location { name:" +name+ ",Latitude:" +latitude+ ",Longitude:"
        +longitude+ ",Address:" +address+ ",PostalCode:" +postalCode+ ",Contact:" +contact+ ",BuildingCount:" + (building != null ? building.length : 0) + "}";
    }

    @Override
    public boolean equals(Object o) {   
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Location location = (Location) o;

        if (Double.compare(location.latitude, latitude) != 0) return false;
        if (Double.compare(location.longitude, longitude) != 0) return false;
        if (!name.equals(location.name)) return false;
        if (!address.equals(location.address)) return false;
        if (!postalCode.equals(location.postalCode)) return false;
        if (!contact.equals(location.contact)) return false;
        // Arrays.equals is used to compare arrays
        return java.util.Arrays.equals(building, location.building);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + address.hashCode();
        result = 31 * result + postalCode.hashCode();
        result = 31 * result + contact.hashCode();
        result = 31 * result + java.util.Arrays.hashCode(building);
        return result;
    }
    
}
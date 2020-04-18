public class Dwelling {
    String streetAddress, city, state, zip;
    int bedrooms;
    double bathrooms;

    public Dwelling(){
        streetAddress = "";
        city ="";
        state = "";
        zip = "";
        bedrooms = 0;
        bathrooms = 0;
    }

    public String getStreetAddress(){
        return streetAddress;
    }
    public void setStreetAddress(String setAddress) {
        this.streetAddress = streetAddress;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getState(){
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip(){
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public int getBedrooms(){
        return bedrooms;
    }
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }
    public Double getBathrooms() {
        return bathrooms;
    }
    public void setBathrooms(double Bathrooms) {
        this.bathrooms = bathrooms;
    }
    @Override
    public String toString(){
      return streetAddress + "|" + city + "|" + state + "|" + zip + "|" + bedrooms + "|" + bathrooms + "|";
    }


}


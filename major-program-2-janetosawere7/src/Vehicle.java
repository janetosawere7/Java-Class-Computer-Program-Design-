public class Vehicle { // Creating class Vehicle
    private String type;
    private int mpg;
    private String color;
    private Engine engine;
    private String vehicleID;
    private int seats;
    private int doors;
    private String make;
    private String model;
    private int mileage;
    private int year;
    private double price;

    public Vehicle(){

    }

  //Creating getters and setters
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // Creating a constructor vehicle with all the properties
    public Vehicle(String type, int mpg, String color, Engine engine, String vehicleID, int seats, int doors, String make,
                   String model, int mileage, int year, double price){
        this.type = type;
        this.mpg = mpg;
        this.color = color;
        this.engine = engine;
        this.vehicleID = vehicleID;
        this.seats = seats;
        this.doors = doors;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return type + "\nYear: "+year+ "\nMake: "+make+ "\nModel: "+model+ "\nMileage: "+mileage+
                "\nMiles Per Gallon: "+mpg+ "\nColor: "+color+ "\nSeats: "+seats+ "\nDoors: "+doors+
                "\nPrice: "+price+ "\nVehicle ID: "+vehicleID+ "\nEngine Specifications: "+engine.toString();
    }
}

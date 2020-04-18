public class Truck extends Vehicle {// Class Truck
    private double bedSpace;

    public Truck(){

    }

    public Truck(double bedSpace){
        this.bedSpace = bedSpace;
    }

    public double getBedSpace() {
        return bedSpace;
    }

    public void setBedSpace(double bedSpace) {
        this.bedSpace = bedSpace;
    }

    @Override
    public String toString(){
        return super.toString() + "Bed Space: " + bedSpace + "\n";
    }
}

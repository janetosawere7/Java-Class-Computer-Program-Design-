public class SUV extends Vehicle { //Class SUV
    private double cargoSpace;
    private boolean removableSeats;

    public SUV(){

    }

    public SUV(double cargoSpace, boolean removableSeats){
        this.cargoSpace = cargoSpace;
        this.removableSeats = removableSeats;
    }


    public double getCargoSpace() {
        return cargoSpace;
    }

    public void setCargoSpace(double cargoSpace) {
        this.cargoSpace = cargoSpace;
    }

    public boolean isRemovableSeats() {
        return removableSeats;
    }

    public void setRemovableSeats(boolean removableSeats) {
        this.removableSeats = removableSeats;
    }

    @Override
    public String toString(){
        String removeSeat = "";
        if (this.removableSeats == false){
            removeSeat = "No";
        } else {
            removeSeat = "Yes";
        }
        return super.toString() + "Cargo Space: " + cargoSpace + "\nRemovable Seats: " + removeSeat + "\n";
    }
}

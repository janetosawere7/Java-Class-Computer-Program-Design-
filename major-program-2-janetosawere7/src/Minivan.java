public class Minivan extends Vehicle { //Class Minivan
    private boolean slidingDoors;

    public Minivan(){

    }

    public Minivan(boolean slidingDoors){
        this.slidingDoors = slidingDoors;
    }


    public boolean isSlidingDoors() {
        return slidingDoors;
    }

    public void setSlidingDoors(boolean slidingDoors) {
        this.slidingDoors = slidingDoors;
    }

    @Override
    public String toString(){
        String slid = "";
        if (this.slidingDoors == false){
            slid = "No";
        } else {
            slid = "Yes";
        }
        return super.toString() + "Sliding Doors: " + slid + "\n";
    }
}

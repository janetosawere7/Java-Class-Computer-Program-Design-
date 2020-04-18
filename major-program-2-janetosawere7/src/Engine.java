//Creating class Engine
public class Engine {
    private String transmission;
    private int cylinders;
    private boolean fourWheelDrive;
    private boolean hybrid;
    private double horsePower;

    //Getter and setter for each property
    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean isHybrid() {
        return hybrid;
    }

    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    public Engine() {
    }
    public Engine(String transmission,int cylinders,boolean fourWheelDrive,boolean hybrid,double horsePower) {
        this.transmission=transmission;
        this.cylinders=cylinders;
        this.fourWheelDrive=fourWheelDrive;
        this.hybrid=hybrid;
        this.horsePower=horsePower;
    }
    @Override
    public String toString() {
        String fourWD = "";
        if (this.fourWheelDrive == false){
            fourWD = "2WD";
        } else {
            fourWD = "4WD";
        }

        String hy = "";
        if (this.hybrid == false){
            hy = "non-hybrid";
        } else {
            hy = "hybrid";
        }
        return "Transmission: "+transmission+ ","+" cylinders: "+cylinders+", "+"four wheel drive: "+fourWD+", "+
                "hybrid: "+hy+ ", "+"horse power: "+horsePower;
    }

}
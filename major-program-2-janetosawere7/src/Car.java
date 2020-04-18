public class Car extends Vehicle { //Class Car inheriting from Vehicle
    private boolean convertible;

    public Car(){

    }

    public Car(boolean convertible){
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    @Override
    public String toString(){
        String convert = "";
        if (this.convertible == false){
            convert = "No";
        } else {
            convert = "Yes";
        }
        return super.toString() + "Convertible: " + convert + "\n";
    }
}


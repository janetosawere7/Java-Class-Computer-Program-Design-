public class Instructor { // Creating class instructor
    private String firstname;
    private String lastname;
    private String officebuilding;
    private int roomNumber;

    //Creating a constructor for class Instructor
    public Instructor() { //This takes no argument
        this.firstname = "Albert";
        this.lastname = "Einstein";
        this.officebuilding = "McNair";
        this.roomNumber = 420;
    }

    //Creating a constructor that takes in parameter for each class property
    public Instructor(String firstname, String lastname, String officebuilding, int roomNumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.officebuilding = officebuilding;
        this.roomNumber = roomNumber;
    }
    //Creating getter and setter for each parameter
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOfficebuilding() {
        return officebuilding;
    }

    public void setOfficebuilding(String officebuilding) {
        this.officebuilding = officebuilding;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    //toString() method that returns each property separated by *
    @Override
    public String toString(){
        return firstname + " * "+lastname+ " * " +officebuilding + " * "+ roomNumber;
    }

}


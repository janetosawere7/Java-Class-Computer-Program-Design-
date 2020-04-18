package contactsmodel;

public class Client {

    private String firstname;
    private String lastname;
    private String gender;
    private int age;
    private String phone;
    private String email;

    public Client(Client information, Client client) {
        firstname = "";
        lastname = "";
        gender = "";
        age = 0;
        phone = "";
        email = "";
    }

    public Client(String fn, String ln, String gndr, int age, String phone, String email){
        firstname = fn;
        lastname = ln;
        gender = gndr;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @Override
    public String toString(){
        return String.format("%-20s%-20s%-10s%10s%20s%30s", firstname, lastname, gender, age, phone, email);
    }
}


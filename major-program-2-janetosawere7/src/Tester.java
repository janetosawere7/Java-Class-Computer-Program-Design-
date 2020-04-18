import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tester {

    private static Scanner readFile;
    private static ArrayList<Vehicle> vehicles;

    public static void main(String[] args){
        vehicles = new ArrayList();

        try {
            readFile = new Scanner(new File("lot.txt"));

            while (readFile.hasNext()){
                String vehicleType = readFile.nextLine().trim();

                switch (vehicleType) {
                    case "Car":
                        vehicles.add(readCar());
                        break;
                }
            }

            String output = " ";
            for (int i = 0; i < vehicles.size(); i++){
                output += vehicles.get(i) + "\n\n";
            }

            JOptionPane.showMessageDialog(null, output);
        } catch (FileNotFoundException e){
            Logger.getLogger(Lot.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    public static Car readCar(){
        Car car = new Car();
        String year = readFile.nextLine();
        year = year.substring(year.indexOf(":")+1);
        car.setYear(Integer.parseInt(year.trim()));
        String make = readFile.nextLine();
        make = make.substring(make.indexOf(":")+1);
        car.setMake(make.trim());
        String model = readFile.nextLine();
        model = model.substring(model.indexOf(":")+1);
        car.setModel(model.trim());
        String mileage = readFile.nextLine();
        mileage = mileage.substring(mileage.indexOf(":")+1);
        car.setMileage(Integer.parseInt(mileage.trim()));
        String mpg = readFile.nextLine();
        mpg = mpg.substring(mpg.indexOf(":")+1);
        car.setMpg(Integer.parseInt(mpg.trim()));
        String color = readFile.nextLine();
        color = color.substring(color.indexOf(":")+1);
        car.setColor(color.trim());
        String seats = readFile.nextLine();
        seats = seats.substring(seats.indexOf(":")+1);
        car.setSeats(Integer.parseInt(seats.trim()));
        String doors = readFile.nextLine();
        doors = doors.substring(doors.indexOf(":")+1);
        car.setDoors(Integer.parseInt(doors.trim()));
        String price = readFile.nextLine();
        price = price.substring(price.indexOf(":")+1);
        car.setPrice(Double.parseDouble(price.trim()));
        String ID = readFile.nextLine();
        ID = ID.substring(ID.indexOf(":")+1);
        car.setVehicleID(ID.trim());
        String engineSpecifications = readFile.nextLine();
        engineSpecifications = engineSpecifications.substring(engineSpecifications.indexOf(":")+1);
        engineSpecifications.trim();
        String[] engineSpecs = engineSpecifications.split(",");
        Engine engine = new Engine();
        engine.setTransmission(engineSpecs[0]);
        if (engineSpecs[1].contains("4")){
            engine.setFourWheelDrive(true);
        } else {
            engine.setFourWheelDrive(false);
        }
        engine.setCylinders(Integer.parseInt(engineSpecs[2].substring(0, 'c').trim()));
        if (engineSpecs[3].trim().equals("hybrid")){
            engine.setHybrid(true);
        } else {
            engine.setHybrid(false);
        }
        engine.setHorsePower(Double.parseDouble(engineSpecs[4].substring(0, 'h').trim()));
        car.setEngine(engine);
        String convertible = readFile.nextLine();
        convertible = convertible.substring(convertible.indexOf(":")+1);
        convertible = convertible.trim();
        if (convertible.equalsIgnoreCase("no")){
            car.setConvertible(false);
        } else {
            car.setConvertible(true);
        }

        return car;
    }
}

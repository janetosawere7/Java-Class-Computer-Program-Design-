import java.io.FileNotFoundException;
import java.util. ArrayList;
import java.io.File;
import java.util.Scanner;
import java.util.List;


public class Driver {

    public static void main(String[] args) throws FileNotFoundException {
        List<Dwelling>dwellingList = new ArrayList<Dwelling>();
        Scanner read = new Scanner(new File("dwelling.txt"));

        while(read.hasNextLine()){

            String line = read.nextLine();
            if(line.isEmpty()) continue;
            Character typeOfDwelling = line.charAt(0);
            String streetAddress = read.nextLine();
            String city = read.nextLine();
            String state = read.nextLine();
            String zip = read.nextLine();
            int bedrooms = Integer.parseInt(read.nextLine());
            double bathrooms = Double.parseDouble(read.nextLine());

            if(typeOfDwelling.equals("H")){
                House newHouse = new House();
                newHouse.setStreetAddress(streetAddress);
                newHouse.setCity(city);
                newHouse.setState(state);
                newHouse.setZip(zip);
                newHouse.setBedrooms(bedrooms);
                newHouse.setBathrooms(bathrooms);

                newHouse.setAcreage(Double.parseDouble(read.nextLine()));
                newHouse.setGarageSize(Integer.parseInt(read.nextLine()));

                dwellingList.add(newHouse);
            } else {
                Apartment newApartment = new Apartment();
                newApartment.setStreetAddress(streetAddress);
                newApartment.setCity(city);
                newApartment.setState(state);
                newApartment.setZip(zip);
                newApartment.setBedrooms(bedrooms);
                newApartment.setBathrooms(bathrooms);

                newApartment.setApptNum(read.nextLine());
                newApartment.setLaundry(read.nextInt() == 1);

                dwellingList.add(newApartment);
            }
        }

        for (Dwelling aDwellingList : dwellingList) {
            System.out.println(aDwellingList);
        }
    }
}


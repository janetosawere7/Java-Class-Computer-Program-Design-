import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Lot extends Application {
    private String lotName;
    private static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public Lot() {

    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getLotName() {
        return lotName;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public void loadVehicles(String fileName) {

        try {
            Scanner sc = new Scanner(new File(fileName));

            duplicate_while(sc);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    private void duplicate_while(Scanner sc) {
        while ((sc.hasNext())) {
            String type = sc.nextLine().trim();

            String yr = sc.nextLine();
            yr = yr.substring(yr.indexOf(':') + 2, yr.length()).trim();
            int year = Integer.parseInt(yr);

            String make = sc.nextLine();
            make = make.substring(make.indexOf(':') + 2, make.length()).trim();
            String model = sc.nextLine();
            model = model.substring(model.indexOf(':') + 2, model.length()).trim();

            String mlg = sc.nextLine();
            mlg = mlg.substring(mlg.indexOf(':') + 2, mlg.length()).trim();
            int mileage = Integer.parseInt(mlg);

            String mp = sc.nextLine();
            mp = mp.substring(mp.indexOf(':') + 2, mp.length()).trim();
            int mpg = Integer.parseInt(mp);

            String color = sc.nextLine();
            color = color.substring(color.indexOf(':') + 2, color.length()).trim();

            String st = sc.nextLine();
            st = st.substring(st.indexOf(':') + 2, st.length()).trim();
            int seats = Integer.parseInt(st);

            String dr = sc.nextLine();
            dr = dr.substring(dr.indexOf(':') + 2, dr.length()).trim();
            int doors = Integer.parseInt(dr);

            String pr = sc.nextLine();
            pr = pr.substring(pr.indexOf(':') + 2, pr.length()).trim();
            double price = Double.parseDouble(pr);

            String ID = sc.nextLine();
            ID = ID.substring(ID.indexOf(':') + 2, ID.length()).trim();

            String engineSpecs = sc.nextLine();
            engineSpecs = engineSpecs.substring(engineSpecs.indexOf(':') + 2, engineSpecs.length());
            String[] e = engineSpecs.split(",");

            boolean FourWD;
            if (e[1].contains("4")) {
                FourWD = true;
            } else {
                FourWD = false;
            }

            boolean hybrid;
            if (e[3].trim().contains("no")) {
                hybrid = false;
            } else {
                hybrid = true;
            }
            e[2] = e[2].substring(0, e[2].indexOf('c')).trim();
            e[4] = e[4].substring(0, e[4].indexOf('h')).trim();

            Engine engine = new Engine(e[0].trim(), Integer.parseInt(e[2]), FourWD, hybrid, Double.parseDouble(e[4]));

            Vehicle v = new Vehicle(type, mpg, color, engine, ID, seats, doors, make, model, mileage, year, price);

            switch (type) {
                case "Car":
                    String cv = sc.nextLine();
                    cv = cv.substring(cv.indexOf(':') + 2, cv.length()).trim();
                    boolean convertible;
                    if (cv.contains("No")) {
                        convertible = false;
                    } else {
                        convertible = true;
                    }

                    vehicles.add(readCar(v, convertible));
                    break;
                case "Truck":
                    String bs = sc.nextLine();
                    bs = bs.substring(bs.indexOf(':') + 2, bs.length()).trim();
                    double bedSpace = Double.parseDouble(bs);
                    vehicles.add(readTruck(v, bedSpace));
                    break;
                case "SUV":
                    String cs = sc.nextLine();
                    cs = cs.substring(cs.indexOf(':') + 2, cs.length()).trim();
                    double cargoSpace = Double.parseDouble(cs);
                    String rs = sc.nextLine();
                    rs = rs.substring(rs.indexOf(':') + 2, rs.length()).trim();
                    boolean removableSeats;
                    if (rs.contains("No")) {
                        removableSeats = false;
                    } else {
                        removableSeats = true;
                    }

                    vehicles.add(readSUV(v, cargoSpace, removableSeats));
                    break;
                case "Minivan":
                    String sd = sc.nextLine();
                    sd = sd.substring(sd.indexOf(':') + 2, sd.length()).trim();
                    boolean slidingDoors;
                    if (sd.contains("No")) {
                        slidingDoors = false;
                    } else {
                        slidingDoors = true;
                    }

                    vehicles.add(readVan(v, slidingDoors));
                    break;
            }
        }
    }

    public void saveVehicles(String fileName) throws IOException {
        FileWriter f = new FileWriter(new File(fileName));

        for (Vehicle v : vehicles) {
            String s = "";
            s += v.toString();

            f.write(s);
        }
        f.close();
    }

    public static Car readCar(Vehicle v, boolean convertible) {
        Car car = new Car();
        car.setType(v.getType());
        car.setMpg(v.getMpg());
        car.setColor(v.getColor());
        car.setYear(v.getYear());
        car.setEngine(v.getEngine());
        car.setVehicleID(v.getVehicleID());
        car.setPrice(v.getPrice());
        car.setSeats(v.getSeats());
        car.setMileage(v.getMileage());
        car.setDoors(v.getDoors());
        car.setMake(v.getMake());
        car.setModel(v.getModel());
        car.setConvertible(convertible);

        return car;
    }

    public static Truck readTruck(Vehicle v, double bedSpace) {
        Truck truck = new Truck();
        truck.setType(v.getType());
        truck.setMpg(v.getMpg());
        truck.setColor(v.getColor());
        truck.setYear(v.getYear());
        truck.setEngine(v.getEngine());
        truck.setVehicleID(v.getVehicleID());
        truck.setPrice(v.getPrice());
        truck.setSeats(v.getSeats());
        truck.setMileage(v.getMileage());
        truck.setDoors(v.getDoors());
        truck.setMake(v.getMake());
        truck.setModel(v.getModel());
        truck.setBedSpace(bedSpace);

        return truck;
    }

    public static SUV readSUV(Vehicle v, double cargoSpace, boolean removableSeats) {
        SUV suv = new SUV();
        suv.setType(v.getType());
        suv.setMpg(v.getMpg());
        suv.setColor(v.getColor());
        suv.setYear(v.getYear());
        suv.setEngine(v.getEngine());
        suv.setVehicleID(v.getVehicleID());
        suv.setPrice(v.getPrice());
        suv.setSeats(v.getSeats());
        suv.setMileage(v.getMileage());
        suv.setDoors(v.getDoors());
        suv.setMake(v.getMake());
        suv.setModel(v.getModel());
        suv.setCargoSpace(cargoSpace);
        suv.setRemovableSeats(removableSeats);

        return suv;
    }

    public static Minivan readVan(Vehicle v, boolean slidingDoors) {
        Minivan van = new Minivan();
        van.setType(v.getType());
        van.setMpg(v.getMpg());
        van.setColor(v.getColor());
        van.setYear(v.getYear());
        van.setEngine(v.getEngine());
        van.setVehicleID(v.getVehicleID());
        van.setPrice(v.getPrice());
        van.setSeats(v.getSeats());
        van.setMileage(v.getMileage());
        van.setDoors(v.getDoors());
        van.setMake(v.getMake());
        van.setModel(v.getModel());
        van.setSlidingDoors(slidingDoors);

        return van;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Lot l = new Lot();
        l.loadVehicles("lot.txt");

        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.setSpacing(5);

        //Vehicles Text Area
        TextArea textArea = new TextArea();
        String text = "";
        for (Vehicle v : vehicles) {
            text += v.toString();
        }

        textArea.setText(text);

        //first hBox with the remove area
        HBox hbTop = new HBox(10);
        hbTop.setAlignment(Pos.TOP_CENTER);
        Label remove = new Label("Remove (ID): ");

        TextField textField = new TextField();
        textField.setPrefSize(200, 10);

        Button rmv = new Button();
        rmv.setText("Remove");

        rmv.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                String ID = textField.getText();
                for (Vehicle v : vehicles) {
                    if (ID.equals(v.getVehicleID().trim())) {
                        vehicles.remove(v);
                        try {
                            l.saveVehicles("lot.txt");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                String text = "";
                for (Vehicle v : vehicles) {
                    text += v.toString();
                }
                System.out.println(text);
                textArea.setText(text);
            }
        });

        hbTop.getChildren().addAll(remove, textField, rmv);
        root.getChildren().add(hbTop);

        //2nd hBox with add area
        HBox hB = new HBox(10);
        hB.setAlignment(Pos.TOP_CENTER);

        Label addAn = new Label("Add a(n): ");

        ComboBox comboBox = new ComboBox();
        comboBox.setPrefSize(200, 10);
        comboBox.getItems().addAll(
                "Car",
                "Truck",
                "SUV",
                "Van"
        );

        comboBox.setValue("Car");

        Button temp = new Button();
        temp.setText("Import\nTemplate");

        Button add = new Button();
        add.setText("Add");

        hB.getChildren().addAll(addAn, comboBox, temp, add);
        root.getChildren().add(hB);

        root.getChildren().add(new Label("Add Vehicle:"));
        TextArea addNew = new TextArea();

        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (addNew != null) {
                    Scanner sc = new Scanner(addNew.getText());

                    duplicate_while(sc);
                }
                try {
                    l.saveVehicles("lot.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String text = "";
                for (Vehicle v : vehicles) {
                    text += v.toString();
                }
                System.out.println(text);
                textArea.setText(text);
            }
        });

        temp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                addNew.clear();
                String newType = (String) comboBox.getValue();
                String addV = "";
                addV += newType + "\nYear: (YEAR)\nMake: (MAKE)\nModel: (MODEL)\nMileage: (MILEAGE)\nMiles Per Gallon: (MPG)" +
                        "\nColor: (COLOR)\nSeats: (SEATS)\nDoors: (DOORS)\nPrice: (PRICE)\nVehicle ID: (ID)\nEngine Specifications: " +
                        "(TRANSMISSION), (2WD OR 4WD), (# cylinders), (hybrid/non-hybrid), (#.# hp)";
                switch (newType) {
                    case "Car":
                        addV += "\nConvertible: (Yes/No)";
                        break;
                    case "Truck":
                        addV += "\nBed Space: (#.#)";
                        break;
                    case "SUV":
                        addV += "\nCargo Space: (#.#) \nRemovable Seats: (Yes/No)";
                        break;
                    case "Van":
                        addV += "\nSliding Doors: (Yes/No)";
                        break;

                }

                addNew.setText(addV);
            }
        });
        temp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                addNew.clear();
                String newType = (String) comboBox.getValue();
                String addV = "";
                addV += newType + "\nYear: (YEAR)\nMake: (MAKE)\nModel: (MODEL)\nMileage: (MILEAGE)\nMiles Per Gallon: (MPG)" +
                        "\nColor: (COLOR)\nSeats: (SEATS)\nDoors: (DOORS)\nPrice: (PRICE)\nVehicle ID: (ID)\nEngine Specifications: " +
                        "(TRANSMISSION), (2WD OR 4WD), (# cylinders), (hybrid/non-hybrid), (#.# hp)";
                switch (newType){
                    case "Car":
                        addV += "\nConvertible: (Yes/No)";
                        break;
                    case "Truck":
                        addV += "\nBed Space: (#.#)";
                        break;
                    case "SUV":
                        addV += "\nCargo Space: (#.#) \nRemovable Seats: (Yes/No)";
                        break;
                    case "Van":
                        addV += "\nSliding Doors: (Yes/No)";
                        break;

                }

                addNew.setText(addV);
            }
        });

        root.getChildren().add(addNew);

        //vehicle database
        root.getChildren().add(new Label("Vehicle Database:"));

        root.getChildren().add(textArea);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("CARMAX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException {
        launch(args);

    }
}





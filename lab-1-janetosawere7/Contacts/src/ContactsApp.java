/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author CCannon
 */
public class ContactsApp extends Application {
    private static ArrayList<Contact> contacts;
    private static ObservableList<String> contactNames;
    
    @Override
    public void start(Stage primaryStage) {
        ListView contactListView = new ListView();
        contactListView.setPadding(new Insets(5,5,5,5));
        contactListView.setItems(contactNames);
        
        VBox commandPane = new VBox();
        Button viewContactButton = new Button("View Contact Details");
        viewContactButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                Contact selectedContact = contacts.get(contactListView.getSelectionModel().getSelectedIndex());
                
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle(selectedContact.getFirstName() + "'s Contact Details");
                alert.setHeaderText(null);
                alert.setContentText(selectedContact.toString());
                
                alert.showAndWait();
            }
        });
        Button closeButton = new Button("Close");
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                System.exit(0);
            }
        });
        commandPane.getChildren().addAll(viewContactButton, closeButton);
        commandPane.setAlignment(Pos.CENTER);
        commandPane.setPadding(new Insets(5,5,5,5));
        commandPane.setSpacing(30.0);
        
        BorderPane root = new BorderPane();
        root.setLeft(contactListView);
        root.setRight(commandPane);
        
        Scene scene = new Scene(root, 450, 300);
        
        primaryStage.setTitle("My Contacts");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        loadContacts(args[0]);
        launch(args);
    }
    
    public static void loadContacts(String filename) {
        contacts = new ArrayList();
        
        ArrayList<String> names = new ArrayList();
        try {
            Scanner contactReader = new Scanner(new File(filename));
            
            while(contactReader.hasNext()) {
                String[] contactString = contactReader.nextLine().split(",");
                Contact newContact = new Contact(contactString[0], contactString[1], contactString[2], contactString[3]);
                contacts.add(newContact);
                names.add(newContact.getFirstName() + " " + newContact.getLastName());
            }
        } catch (FileNotFoundException ex) {
            System.err.print("Contact list csv not found");
            Logger.getLogger(ContactsApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        contactNames = FXCollections.observableArrayList(names);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactsapp;

import contactsmodel.ContactList;
import contactsmodel.Client;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author kelvin
 */
public class FXMLDocumentController implements Initializable {
    ContactList contacts = new ContactList();

    @FXML
    private Button btnLoad;
    @FXML
    private Button btnSave;
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnExit;
    @FXML
    private Label lblName;
    @FXML
    private ListView<String> lstNames;
    @FXML
    private Label lblFirstName;
    @FXML
    private Label lblGender;
    @FXML
    private Label lblAge;
    @FXML
    private Label lblPhone;
    @FXML
    private Label lblEmail;
    @FXML
    private Label lblLastName;


    @FXML
    private void handleLoadAction(ActionEvent event) {
        try {
            contacts.loadContacts("contacts.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        lblName.setText(contacts.getListName());

        ObservableList<String> items = FXCollections.observableArrayList();

        for (int i=0; i<contacts.size(); i++) {
            items.add(contacts.getContact(i).getLastname() + ", " + contacts.getContact(i).getFirstname());
        }

        lstNames.setItems(items);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //System.out.println("In Controller");
    }

    @FXML
    private void handleSaveAction(ActionEvent event) {
    }

    @FXML
    private void handleAddAction(ActionEvent event) {
    }

    @FXML
    private void handleExitAction(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    private void handleListViewActioon(MouseEvent event) {
        int index = lstNames.getSelectionModel().getSelectedIndex();
        Client client = contacts.getContact(index);

        lblFirstName.setText(client.getFirstname());
        lblLastName.setText(client.getLastname());
        lblGender.setText(client.getGender());
        lblAge.setText(client.getAge()+"");
        lblPhone.setText(client.getPhone());
        lblEmail.setText(client.getEmail());

    }

}

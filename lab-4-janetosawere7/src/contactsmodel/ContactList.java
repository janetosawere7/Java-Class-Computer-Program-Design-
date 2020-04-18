package contactsmodel;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class ContactList {

    public static void main(String[] args) throws FileNotFoundException {
        ContactList cl = new ContactList();
                cl.loadContacts("contacts.txt");
                System.out.print(cl.toString());
    }

    private String listName;
    private ArrayList<Client>contacts;

    public ContactList() {
        listName = "";
        contacts = new ArrayList<>();
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listname) {
        this.listName = listname;
    }
    public Client getContact (int index) {
        return contacts.get(index);
    }
    public int size (){
        return contacts.size();
    }
    private void deleteContact(int index){
        contacts.remove(index);
    }
    public void addContact(Client client){
        contacts.add(client);
    }
    public void loadContacts(String filename) throws FileNotFoundException {
        try{
            Scanner read = new Scanner(new File(filename));
            listName = read.nextLine();
            while(read.hasNext()){
                String[] information= read.nextLine().split("");
                Client client = new Client(information[0],information[1],information[2],
                        Integer.parseInt(information[3]), information[4], information[5]);
                contacts.add(client);
        }
        }catch(FileNotFoundException ex){
            System.out.println("File is not present");
        }
    }
    public void saveContacts(String filename){
    try{
        PrintWriter pw = new PrintWriter(new File(filename));
        pw.print(this.toString());
        pw.close();
    }catch(FileNotFoundException ex){
        System.out.println("File not found");
    }
    }
    @Override
    public String toString(){
        String s ="";
          for (int i= 0; i< size(); i ++){
              s += contacts.get(i) + System.lineSeparator();
          }
        return listName + System.lineSeparator() + s;
          }
}







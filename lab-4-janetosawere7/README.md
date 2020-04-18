# Classes and ArrayLists

## This is a for COMP 167 Computer Program Design at North Carolina A&T State University.

## Instructor: Professor Karen Schnell - klschnell@ncat.edu

### Lab Description

You will be creating a contacts application to store information about clients for a business. I will give you a GUI project that I developed and you will to provide the backend functionality for the GUI project by developing two classes: Client and ContactList. The data for your application will come from a comma delimited file containing information about the clients. Ideally, you would use the validation methods to filter out contacts with issues. You are free to use the validation methods developed in the String Processing lab; however, it is not a requirement. You can just load all the records from the file this week. Note: You will have to modify the input method from the String Processing lab since I changed the input file format slightly by adding the name of the contact list as the first line of input (See the Input File Format section below).

![Figure01](https://github.com/NCATCS/images/blob/master/Figure04-01.png)

#### Step 1:

The project is already created for you. Right click on the src folder and create a new package ***named contactsmodel***. Next, create the Client class in this project under the contactsmodel package. Once you have finished adding the code for Client, test it out adding code to your main method that declares and instantiates a Client object. Use the setter methods to modify some properties. Output the contents of the client object using the toString() and System.println() methods. Make sure the toString() method returns a string with values seperated by a comma.

##### Client Class
This class will model a single client.
![Figure02](https://github.com/NCATCS/images/blob/master/Figure04-02.png)

#### Step 2:

Within the same package, create the ContactList class (notice that “Contact” is not plural). At this point, you will want to set the Working Directory to where you saved your contacts.txt input file. **For this lab, you may assume that the input file will always be named “contacts.txt”**. Implement the methods for the ContactList class according to the UML Class Diagram below. To test the loadContacts() method, call and return value from the toString() method of the ContactList class. It should display each client in a nicely formatted table. You should then add some new contacts to your ContactsList object by instantiating new Client objects, populating them with data and then calling the addContact method. After adding some contacts, call the saveContacts() method and exit your program. When you restart your program using your modified input file, the added contacts should be loaded.

##### ContactList Class
This class will contain an ArrayList and will model the entire contact list for an individual or the entire company.
![Figure03](https://github.com/NCATCS/images/blob/master/Figure04-03.png)

##### Input File Format:
>
> list name
> 
> firstname<sub>0</sub>, lastname<sub>0</sub>, gender<sub>0</sub>, age<sub>0</sub>, phone<sub>0</sub>, email<sub>0</sub>
> firstname<sub>1</sub>, lastname<sub>1</sub>, gender<sub>1</sub>, age<sub>1</sub>, phone<sub>1</sub>, email<sub>1</sub>

#### Step 3:

Integrate your code with my GUI. If you do not implement things as outlined in the UML class diagrams, then your code will probably not work with my GUI code. Just FYI, the GUI project was created using the JavaFX SceneBuilder tool so there will be a lot of stuff in there that will look foreign. You do not have to worry about understanding my code since you will not be modifying any of it. You simply need to make your classes available for the GUI. Make sure you set the ContactsApp project as your main project. Note: I did not get a chance to implement the Add functionality on the GUI so clicking the button will not initiate any action. 

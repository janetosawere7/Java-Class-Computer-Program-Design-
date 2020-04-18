# Simple Inheritance

### This is a lab for COMP 167 Computer Program Design at North Carolinga A&T State University.

### Instructor: Professor Karen Schnell - klschnell@ncat.edu

## Lab Description
In this lab, you will be creating several classes that will be related by inheritance. You will also create a simple client class to output the contents of the created objects.

### Driver Class 
This class has the following properties: streetAddress:String, city:String, state:String, zip:String, bedrooms:int, bathrooms:double. In addition to the standard getter/setter methods, the class also has a no-arg constructor that sets all properties to their Java default values. Override the toString() method such that it prints all the properties separated by the ‘|’ character.

### House Class
This class inherits from the Driver class but also includes the properties: acreage:double and garageSize: int (0 means no garage, 1 means one car garage, etc.). Include a no-arg constructor and override the toString() method in a similar fashion as you did for the Driver class. Your toString method must use the `super` keyword.

### Apartment Class
This class also inherits from the Driver class but also include the properties: apptNum:String, laundry:boolean (indicates if the appartment has washer and dryer connections). Include a no-arg constructor and override the toString() method in a similar fashion as you did for the Driver class. Your toString method must use the `super` keyword.

### Input File Format


Assume the following format for the program input file:

Driver type (H or A) Street Address

City

State

Zip

#bedrooms

#bathrooms

Other properties depending on the Driver Type

#### Example File
```
H
1601 East Maple Lane
Smallville
NC
28443
3
2
A
9981 Main Street
Fayetteville
NC
28311
2
1.5
9B
1 /* 0 means no and 1 means yes */
```

### Driver/Test Class
You will need to create a main method that passes in the name of the input file using command line arguments. The input file should be opened and your program should read in all the Driver information into an ArrayList<Driver>. Also write a method in the same file that outputs the properties of each dweiling in a JOptionPane.
  

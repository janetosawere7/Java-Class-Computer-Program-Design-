# Classes and ArrayLists

## This is a for COMP 167 Computer Program Design at North Carolina A&T State University.

## Instructor: Professor Karen Schnell - klschnell@ncat.edu

### Lab Description

You will be implementing the Comparable interface in this lab.

#### Card class

First, create a class named Card with the following properties: color:Color, value:String. The card would be used in the game of Uno. Add two constructors (no-arg constructor and a constructor that includes both properties), toString(), mutator and accessor methods. The toString method should use the “,” character to separate properties.

Your Card class should implement the Comparable interface as discussed in class. Implement the compareTo method that sorts by color then by value. So, if the cards have the same color, you need to look at the value to determine whether one card is less than the other. Use alphabetical order to compare colors.

When implementing `compareTo()`, remember the following rules:

- Return a value _greater_ than 0 if this comes **after** other.
- Return a value _less_ than 0 if this comes **before** other.
- Return a value of 0 is this comes **at the same time** as other.

#### Deck Class

Create a Deck class consisting of 108 Cards represented in an ArrayList<Card> named cards. There are 0 x 1, 1 to 9 x 2 for each color (Red, Green, Blue, Yellow) = 76 cards. The game of Uno has other cards; however, we are ignoring them for this exercise. Here is an example of creating just the Green cards with the number values set that would be a part of the Deck constructor:
```
cards.add( new Card( Color.green, “0”) );
for (int i=1; i<=9; i++) {
  cards.add( new Card( Color.green, i+””) );
  cards.add( new Card( Color.green, i+””) );
}
```
                   
`void shuffle()` - Add a method to your Deck class that shuffles (randomizes) the cards. Perform this operation 7 times.

`void sort()` - This method should sort your deck and should simply consist of a call to the static method sort() of the Collections class. This Collections.sort() method will sort your ArrayList since your Card class implements the Comparable interface.

`String toString()` – return a string with all the cards separated by a “|”. Insert a newline after every 15 cards.

#### Main Method

- Your main method should :
- Be in a third class, not `Card` or `Deck`
- Instantiate a new deck of cards
- Shuffle the cards
- Output the shuffled (randomized) cards to a JavaFX Dialog.
- Sort the cards.
- Output the sorted cards to a JavaFX Dialog.
  - You can find a detailed introduction to JavaFX Dialogs [here](https://code.makery.ch/blog/javafx-dialogs-official/)
  
In order to use a JavaFX Dialog, you must use the following format for your main class:
```
public class Lab8 extends Application {
  public static void main(String[] args) {
    Application.launch();
  }
  
  public void start(Stage primaryStage) throws Exception {
    //All main method code should go here
  }
}
```

This format is required because a JavaFX dialog needs a JavaFX Application to run within. We will go deeper into JavaFX Applications next lab.

### Grading

You must complete your main method that shows the sorted cards (i.e. complete the Comparable part
of the lab) to received 20pts on this lab.

- 15 points for participation
- 1 point for the `Card` class properties, constructors, and `toString()`
- 1 point for properly implementing `Comparable`
- 1 point for `Deck` class
- 2 points for properly displaying output

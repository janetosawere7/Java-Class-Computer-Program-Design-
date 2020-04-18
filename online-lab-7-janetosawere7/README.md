# Online Lab 7

Read all instructions before you begin. As always, you are expected to commit and push at after completing each problem.


## Grading

You are supposed to have your assigned reviewer as stated in MP1 to grade this lab. Make sure to put them as a reviewer to get your grade. If it is not on GitHub you will not get credit.

## Problem 1 (5 points)

The Instructor class consists of a firstname (String), lastname (String), office building (String) and room number (int). There is a no-arg constructor that initializes the properties to “Albert”, “Einstein”, “McNair”, 420. There is also a constructor with a parameter for each class property. Finally, there is a toString() method that returns each property separated by an asterisk * .
1. Create a Netbeans project and name it CourseScheduler.
2. Implement the Instructor class in Java. Declare and instantiate two Instructor objects in the main() method of your project (one object using each constructor). Output the object properties to the console using the toString() method. 

## Problem 2 (5 points)

The Textbook class consists of a title (String), publisher (String) and edition (int). There is a no-arg constructor that initializes Strings to “” and numeric values to zero. A second constructor has formal parameters for each property. The class toString() method returns a String with each property separated by a `System.lineSeparator()` char.
1. Implement the Textbook class in the CourseScheduler project. Declare and instantiate Textbook objects in the main() using both constructors. Output the object properties using the toString() method. 

## Problem 3 (5 points)

The Course class consists of a name (String), semester (String), instructor (Instructor) and textbook (Textbook). As with the previous classes, there are two constructors: one no-arg constructor and one constructor with formal parameters for each property. The no-arg constructor initializes reference variables to null. The toString() method separates the name and semester by a comma (‘,’). There is a `System.lineSeparator()` char after the semester property and between the Instructor and Textbook properties. The Instructor and Textbook properties are formatted using the toString() method from their respective classes.
1. Implement the Course class in the CourseScheduler project. Instantiate Instructor and Textbook objects and use them along with the course name and semester as parameters to the Course constructor. Output the properties of the Course object using the toString() method. You can verify the format of the toString() by comparing it with the file input format described in Problem 4 below.

## Problem 4 (5 points)

1. Declare and instantiate an ArrayList<Course> in the main() method. Name it courses.
2. Implement the following method in the same class as the main():
public static void readCourseData( ArrayList<Course> courses, String filename )
3. Make a call to readCourseData() from the main() passing the ArrayList and the filename as
parameters. Write a loop under the call to readCourseData to output all the course data to the
console by calling toString() for each Course object in the ArrayList.
  
**Hint:** In order to split a line delimited by an asterisk, you must use the escape character `\\`. Ex. `.split("\\*")`

## Input File Format

```
Course 1 name, Semester
Instructor firstname * Instructor lastname * Building * Room number
Textbook title
Textbook publisher
Textbook edition
Course 2 name, Semester
Instructor firstname * Instructor lastname * Building * Room number
Textbook title
Textbook publisher
Textbook edition
…
Course N name, Semester
Instructor firstname * Instructor lastname * Building * Room number
Textbook title
Textbook publisher
Textbook edition
```

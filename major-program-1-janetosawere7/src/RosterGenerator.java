import java.util.Scanner;

public class RosterGenerator {

    private static Player roster;

    //setting the main method (Level 2)
    public static void main(String[] args) {

        //Creating an array of integers
        int[] jerseyNumber = new int[5];
        int[] rating = new int[5];
        // Scanner object to prompt user to enter jerseyNumber and rating
        Scanner scnr = new Scanner(System.in);

        //Printing jerseyNumber and rating to the screen
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter player" + (i + 1) + " 's jersey number:");

            jerseyNumber[i] = scnr.nextInt();
            System.out.println();

            //Printing players rating
            System.out.print("Enter player" + (i + 1) + "'s rating:");
            rating[i] = scnr.nextInt();
            System.out.println("");
        }
        //This is to implement the Roster
            System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.println("Player" + (i + 1) + " Jersey number: " + jerseyNumber[i] + ", Rating: " + rating[i]);
        }
            System.out.println("");

        //This is to create a menu option for the user to modify roster (Level 3)
        boolean complete = false;

        String menuOption;
        //using loop for player to select menu option
        while (!complete) {
            System.out.println("MENU");
            System.out.println("u - Update player rating");
            System.out.println("a - Output players above a rating");
            System.out.println("r - Replace player");
            System.out.println("o - Output roster");
            System.out.println("q - Quit");
            System.out.println("Choose an option: ");

            //This menu option reads what is selected by the player
            menuOption = scnr.nextLine();
            if (menuOption.contains("q")) {
                complete = true;// This means user chose Quit menu
            }

            //This is to implement the menu option 'o' which is the Output roster (Level 4)
            // When user selects output roster
            else if (menuOption.contains("o")) {
                System.out.println("Roster");
                for (int i = 0; i < 5; i++) {
                    System.out.println("Player" + (i + 1) + " --" + " Jersey number: " + jerseyNumber[i]
                            + ", Rating: " + rating[i]);
                }

            }
            //If the player's rating is updated (level 5)
            else if (menuOption.contains("u")) {
                // This prints the jersey number of the players// to update rating
                System.out.print("Enter a jersey Number: ");
                int newJersey = scnr.nextInt();// To prompt user to enter new jersey number
                System.out.print("Enter a new rating for player: ");   //New rating for the player

                int newRating = scnr.nextInt();
                for (int i = 0; i < 5; i++) {
                    if (jerseyNumber[i] == newJersey) {
                        rating[i] = newRating;
                        break;
                    }
                }
            }
            //To select output player above rating (level 6)
            else if (menuOption.contains("a")) {
                System.out.println("Enter a rating: ");
                //scanner to prompt user to input data
                int aboveRating = scnr.nextInt();
                System.out.println("ABOVE" + aboveRating); //This prints the output above player rating
                int i;
                for (i = 0; i < 5; i++) {
                    if (rating[i] > aboveRating) {
                        System.out.println("Player " + (i + 1) + " -- Jersey number: " + jerseyNumber[i] + ", Rating: " + rating[i]);
                    }
                }
                System.out.println();

            } else if (menuOption.contains("r")) {//To replace player (level 7)
                System.out.println("Enter a jersey number: ");
                //scanner to prompt user to enter jersey number to be replaced
                int hold = scnr.nextInt();

                System.out.println("Enter new jersey number: "); //This prints the new players jersey number
                int newPlayer = scnr.nextInt();

                System.out.println("Enter a rating for the new player: ");// To print the new rating for the new player
                int newRating = scnr.nextInt();//For user to enter new rating for replaced player

            }



        }
    }
}

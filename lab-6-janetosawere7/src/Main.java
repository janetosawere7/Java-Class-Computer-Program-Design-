import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.*;

public class Main extends Application {
    public static void main(String[] args){
        Application.launch();
   }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Deck deck = new Deck();//instantiating a new deck of cards
        deck.shuffle();// this is to shuffle the cards
        JOptionPane.showMessageDialog(null, deck.toString(), null, JOptionPane.INFORMATION_MESSAGE);

        deck.sort(); // sorting the cards
        JOptionPane.showMessageDialog(null, deck.toString(), null, JOptionPane.INFORMATION_MESSAGE);
    }
}




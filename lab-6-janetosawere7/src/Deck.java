
import java.util.ArrayList;
import java.awt.Color;
import java.util.Collections;
import java.util.List;
import java.lang.*;
public class Deck { //public class Deck containing an ArrayList
    List<Card> cards = new ArrayList<Card>(108);

    public Deck (){ //creating a constructor for Deck
        this.cards.add( new Card( Color.red, "0 "));//setting number values for each Color in Deck constructor
        this.cards.add( new Card( Color.green, "0 "));
        this.cards.add( new Card( Color.blue, "0 "));
        this.cards.add( new Card( Color.yellow, "0 "));
        for (int i = 1; i<= 76; i++){
            this.cards.add( new Card( Color.red, i + " "));
            this.cards.add( new Card( Color.green, i + " "));
            this.cards.add( new Card( Color.blue, i + " "));
            this.cards.add( new Card( Color.yellow, i + " "));

        }
    }
    /* adding method shuffle to Deck class.
    This preforms shuffles by randomizing the cards 7 times.
     */
    public void shuffle(){
        for (int j = 0; j< 7; j++){
            for (int i = 0; i < 76; i++){
                int randomNumber = (int) (Math.random() *75);
                Card temp = this.cards.get(randomNumber);
                this.cards.set(randomNumber, this.cards.get(i));
                this.cards.set(i, temp);
            }
        }
    }
    public void sort() {
        Collections.sort(this.cards);
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 67; i++){
            result.append(this.cards.get (i).toString() + "|");
            if((i + 1 % 15) == 0 ){
                result.append("\n");
            }
        }
        return result.toString();
    }


}

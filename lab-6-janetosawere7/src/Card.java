import java.awt.*;

public class Card implements Comparable<Card>{
    // private instance variable, that is not accessible from outside the class Card
    private Color color;
    private String value;

    //Creating a constructor
    public Card(Color color, String value){ //initializing the two instance variables (Color color and String value)
        super();
        this.color =color;
        this.value = value;
    }
    public Card(){ // Constructor that includes toString, mutator and accessor
    }
    public Color getColor(){ //Accessor(getter) for instance variable color
        return color;
    }
    public void setColor(Color color){ // Mutator (setter) for instance variable color
        this.color = color;
    }
    public String getValue(){ //Accessor(getter) for instance variable value
        return value;
    }
    public void setValue(String value){ //Accessor(setter) for instance variable value
        this.value = value;
    }
    @Override
    public String toString(){ //implementing the toString method to get a string representation of the properties.
        return "Card [color=" + getColorName()+ ", value=" + value + "]";
    }

    public int compareTo(Card o){ // compareTo sorts that sorts by color and value
        int result = 0;
        if (o.getValue()!= null && this.getValue()!= null){
            result = ((Integer)Integer.parseInt(o.getValue())).compareTo(Integer.parseInt(this.getValue()));
            if(result == 0){
                return o.getColorName(). compareTo(this.getColorName());
            }
        }
        return result;
    }
    public String getColorName(){
        if (Color.green == this.color){
            return "green";
        }
        else if (Color.yellow == this.color){
            return "yellow";
        }else if (Color.blue == this.color){
            return "blue";
        }else{
            return "red";
        }
    }
}

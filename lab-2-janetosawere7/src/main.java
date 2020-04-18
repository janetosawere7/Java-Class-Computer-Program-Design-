import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main<scoreArray, i> {
    public static void main (String args[]){
     String[] names = new String [80];
     int[] scores = new int [80];
     File fileName = new File(args[0]);
     populateArray(names,scores,fileName);
     printArrays(names,scores);
     double a = averageScore(scores);
     System.out.println(a);
    }

    private static void populateArray(String[] names, int[] scores, File fileName) {
        Scanner file = null;
        try {
            file = new Scanner(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int counter = 0;
        while(file.hasNext()){
            names[counter] = file.next();
            scores[counter]= Integer.parseInt(file.next());
            counter++;
        }

    }
public static void printArrays(String[]playerArray,int[] scoreArray){
        System.out.print("%10Player Name %10High Score");
        for(int i=0;i<playerArray.length;i++){
            System.out.printf("%10s %10d", playerArray[i], scoreArray[i]);
        }
}
public static double averageScore(int[] scoreArray){
        double sum = 0;
        int ArraySize = scoreArray.length;
        for(int i=0; i< ArraySize; i++){
            sum += scoreArray[i];
        }
        return sum/ArraySize;
}
public static void selectionSort(String[]playerArray, int[] scoreArray){
        int max_ind;
        for(int i=0; i < scoreArray.length; i++){};
        max_ind = i;
        for(int j = i + 1; j <scoreArray.length;j++){
            if(scoreArray[j] > scoreArray[max_ind]){
                max_ind = j;
            }
        }

        cur = node.head; // 2

        while(cur.next != null){

    }
        cur = 

}




}

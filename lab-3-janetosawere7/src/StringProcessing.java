import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;
// Java program to check if an email address 
// is valid using Regex. 
import java.util.Scanner;

public class StringProcessing{
    Scanner input ;

    public static void main(String [] args){
        boolean addRecord;
        String[] finalOutputRecord = new String[100];
        int recordCount = 0;
        String filename = "src/records.txt";
        try(Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)))){
    
            while(sc.hasNextLine()){
                String[] line = sc.nextLine().trim().split(",");
                String output = String.format("%-15s%-15s%-10s%10s%-10s%-20s", 
                line[0], line[1], line[2], line[3], line[4], line[5]);
                
                addRecord = true;
                
                if(validateName(line[0].trim())){
                    System.out.println("Error Validating firstName: " + line[0]);
                    addRecord = false;
                }
                if(validateName(line[1].trim())){
                    System.out.println("Error Validating lastName: " + line[1]);
                    addRecord = false;
                }
                if(!validateGender(line[2].trim())){
                    System.out.println("Error Validating Gender: " + line[2]);
                    addRecord = false;
                }
                if(!validateAge(line[3].trim())){
                    System.out.println("Error Validating Age: " + line[3]);
                    addRecord = false;
                }
                if(!validatePhone(line[4].trim())){
                    System.out.println("Error Validating Phone: " + line[4]);
                    addRecord = false;
                }
                if(!validateAddress(line[5].trim())){
                    System.out.println("Error Validating email: " + line[5]);
                    addRecord = false;
                }
                if(addRecord){
                    finalOutputRecord[recordCount] = output;
                    ++recordCount;
                }
                    
                
            }
        } 
        catch(Exception e){
            System.out.print("File not found exception");
        }

        for(int i =0; i<recordCount; ++i){
            System.out.println(finalOutputRecord[i]);
        }
    }


    public static boolean validateAddress(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
        "[a-zA-Z0-9_+&*-]+)*@" + 
        "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
        "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 

    public static boolean validatePhone(String phone){
        int count =0;
        for(int i = 0; i<phone.length(); ++i){
            if(!Character.isDigit(phone.charAt(i))){
                if(!(phone.charAt(i) == '(' ||phone.charAt(i) == ')' ||phone.charAt(i) == '-'||phone.charAt(i) == ' ')){
                return false;
                }
                continue;
            }
            ++count;
        }
        if(count == 10){
            return true;
        }
        return false;
    }

    public static boolean validateAge(String StringAge){
        int age = Integer.parseInt(StringAge);
        if(1 <= age && age <= 130){
            return true;
        }
        return false;
    }

    public static boolean validateGender(String gender){
        
        if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")){
            return true;
        }
        return false;
    }

    public static boolean validateName(String name){
        for(int i = 0; i<name.length(); ++i){
            if(!Character.isLetter(name.charAt(i))){
                return true;
            }
        }
        return false;
    }
    
}



import java.util.Scanner;
import java.util.Random;

public class RandomPasswordGenerator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter password length: ");
        int length=sc.nextInt();

        System.out.print("Include lowercase letters?(yes/no): ");
        String lowerChoice=sc.next();

        System.out.print("Include uppercase letters?(yes/no): ");
        String upperChoice = sc.next();

        System.out.print("Include numbers?(yes/no): ");
        String numberChoice = sc.next();

        System.out.print("Include special characters?(yes/no): ");
        String specialChoice = sc.next();
        
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*";
        String characters = " ";

        if(lowerChoice.equalsIgnoreCase("yes")){
            characters += lowerCase;
        }

        if(upperChoice.equalsIgnoreCase("yes")){
            characters += upperCase;
        }

        if(numberChoice.equalsIgnoreCase("yes")){
            characters += numbers;
        }

        if(specialChoice.equalsIgnoreCase("yes")){
            characters += special;
        }

        if(length<=0){
            System.out.println("Password length must be greater than 0.");
        }
        else if(characters.length()==0){
            System.out.println("Please select atleast one character type.");
        }
        else{
            String password = "";

            for(int i=0; i<length; i++){
                int index = random.nextInt(characters.length());
                password += characters.charAt(index);
            }
            System.out.println("Generated Password: " + password);
        }
        sc.close();
    }
}


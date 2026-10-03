import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word or phrase:");
        String str=sc.nextLine();

        String cleaned= str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String reversed="";

        for(int i=cleaned.length()-1;i>=0;i--){
            reversed+=cleaned.charAt(i);
        }
        if(cleaned.equals(reversed)){
            System.out.println(str+" is a palindrome.");
        }
        else{
            System.out.println(str+" is not a palindrome.");
        }
        sc.close();
    }

}

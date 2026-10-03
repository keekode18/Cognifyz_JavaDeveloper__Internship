import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature :");
        double temp = sc.nextDouble();

        System.out.println("Enter unit (C for Celsius, F for Fahrenheit):");
        char unit = sc.next().charAt(0);

        if(unit=='C'|| unit=='c'){
            double fahrenheit = (temp * 9/5) + 32;
           System.out.println("Temperature in Fahrenheit: " + fahrenheit);
       }
       else if(unit=='F' || unit=='f'){
        double celsius=(temp-32)*5/9;
        System.out.println("Temperature in Celsius: " + celsius);
       }
       else{
        System.out.println("Invalid unit");
       }
       sc.close();
    }
}

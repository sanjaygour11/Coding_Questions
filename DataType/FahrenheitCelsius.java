package DataType;

import java.util.Scanner;

public class FahrenheitCelsius {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       // Write a Java program to take the temperature in Fahrenheit as input
       // from the user and convert it into Celsius. Display the converted temperature.

        System.out.println("Enter the fahreh");

        int f=scan.nextInt();

        System.out.printf("%.4f",(f-32)*5.0/9);
    }
}

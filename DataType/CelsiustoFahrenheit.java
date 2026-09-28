package DataType;

import java.util.Scanner;

public class CelsiustoFahrenheit {
    public static void main(String[] args) {

        //Write a Java program to take the temperature in Celsius as input from
      //  the user and convert it into Fahrenheit. Display the converted temperature.

        Scanner scan=new Scanner(System.in);

        int c=scan.nextInt();

        float f=c;
        System.out.println((f*9/5)+32);
    }
}

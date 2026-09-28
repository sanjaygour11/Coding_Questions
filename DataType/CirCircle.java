package DataType;

import java.util.Scanner;

public class CirCircle {
    public static void main(String[] args) {

      //  Write a Java program to take the radius of a circle as input from the user
       //and calculate and display the circumference of the circle.
        Scanner scan=new Scanner(System.in);

        float pi=3.142f;

        System.out.println("Enter the radius");

        int r=scan.nextInt();

        System.out.printf("%.4f",(2*pi*r));






    }
}

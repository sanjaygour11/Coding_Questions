package DataType;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        //Write a Java program to take the radius of a circle
       // as input from the user and calculate and display the area of the circle.
        Scanner scan=new Scanner(System.in);

        float pi=3.142f;

        System.out.println("Enter the radius");

        int r=scan.nextInt();

        System.out.printf("%.4f",(pi *r*r));

        


    }

}

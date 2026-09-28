package DataType;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {

       // Write a Java program to take the radius and height of a cylinder
       // as input from the user and calculate and display the total surface area of the cylinder.

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the radius");
        int r=scan.nextInt();

        System.out.println("Enter the height");

        int h=scan.nextInt();

        double area=(2*3.142*r*(r+h));

        System.out.println(area);

    }
}

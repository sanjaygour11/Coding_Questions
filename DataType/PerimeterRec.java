package DataType;

import java.util.Scanner;

public class PerimeterRec {
    public static void main(String[] args) {

       // Write a Java program to take the length and breadth of a
       // rectangle as input from the user and calculate and display the perimeter of the rectangle.

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the length");

        int l=scan.nextInt();

        System.out.println("Enter the breadth");

        int b=scan.nextInt();

        System.out.println("Perimeter of the rectangle=: "+(2*(l+b)));


    }
}

package DataType;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       // Write a Java program to take the side of a square as input from the
       // user and calculate and display the perimeter of the square.

        System.out.println("Enter the side");
        int s=scan.nextInt();
        System.out.println(4*s);

    }
}

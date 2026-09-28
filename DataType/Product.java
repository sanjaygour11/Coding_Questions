package DataType;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       // Write a Java program to take three integers as input from the
       // user and calculate and display their product.


        System.out.println("Enter the first no.");
        int a=scan.nextInt();

        System.out.println("Enter the second no.");
        int b=scan.nextInt();

        System.out.println("Enter the third no.");
        int c=scan.nextInt();

        System.out.println("Product is =: "+(a*b*c));
    }
}

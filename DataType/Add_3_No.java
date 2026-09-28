package DataType;

import java.util.Scanner;

public class Add_3_No {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       // Write a Java program to take three integer numbers as input from the
      //  user and calculate and display their sum.

        System.out.println("Enter the first no.");
        int a=scan.nextInt();

        System.out.println("Enter the second no.");
        int b=scan.nextInt();

        System.out.println("Enter the third no.");
        int c=scan.nextInt();

        System.out.println("Sum is =: "+(a+b+c));


    }
}

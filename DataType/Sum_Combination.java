package DataType;

import java.util.Scanner;

public class Sum_Combination {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


       // Write a Java program to take three integers as input from the user
      //  and calculate the sum of all possible combinations of these three integers.
        System.out.println("Enter the first no.");
        int a=scan.nextInt();

        System.out.println("Enter the second no.");
        int b=scan.nextInt();

        System.out.println("Enter the third no.");
        int c=scan.nextInt();

        System.out.println("Sum= "+(a+b));

        System.out.println("Sum= "+(a+c));

        System.out.println("Sum= "+(b+c));



    }
}

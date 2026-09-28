package DataType;

import java.util.Scanner;

public class DollarToRupee {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

       // Write a Java program to take an amount in US Dollars ($)
       // as input from the user and convert it into Indian Rupees (₹).

  System.out.println("Enter the rs");

   int rs=scan.nextInt();

   double d=82.73;

        System.out.printf("%.4f",(rs*d));

    }
}

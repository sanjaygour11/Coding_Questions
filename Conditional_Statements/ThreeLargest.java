package Conditional_Statements;

import java.util.Scanner;

public class ThreeLargest {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the first no.");

        int n=scan.nextInt();

        System.out.println("Enter the second no.");

        int n1=scan.nextInt();

        System.out.println("Enter the third no.");

        int n2=scan.nextInt();

        if(n>n1 && n>n2){
            System.out.println(n);

        } else if (n1>n && n1>n2) {
            System.out.println(n1);

        }
        else{
            System.out.println(n2);
        }
    }
}

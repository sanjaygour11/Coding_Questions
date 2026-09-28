package Conditional_Statements;

import java.util.Scanner;

public class LargestNoTwo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the first no.");
        int n=scan.nextInt();

        System.out.println("Enter the second no.");

        int n1=scan.nextInt();

        if(n>n1){
            System.out.println(n);
        }
        else{
            System.out.println(n1);
        }
    }
}

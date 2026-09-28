package Conditional_Statements;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the no.");

        int n=scan.nextInt();

        if(n%2!=0){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}

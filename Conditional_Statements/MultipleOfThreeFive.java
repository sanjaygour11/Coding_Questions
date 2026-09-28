package Conditional_Statements;

import java.util.Scanner;

public class MultipleOfThreeFive {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the no.");
        int n=scan.nextInt();

        if(n%3==0 && n%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

package Conditional_Statements;

import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the no.");

        int n=scan.nextInt();
        if(n>=65  && n<=90){
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
}

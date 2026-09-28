package Conditional_Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MultipleOfFive {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the no.");
        int n=scan.nextInt();
        if(n%5==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

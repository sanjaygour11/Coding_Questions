package Conditional_Statements;

import java.util.Scanner;

public class AsciValueNo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        if(n>=47 && n<=57){

            System.out.println("Number");
        }
        else{
            System.out.println("Character");
        }
    }
}

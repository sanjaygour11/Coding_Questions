package Conditional_Statements;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        if(n>=97 && n<=122){
            System.out.println("Yes LowerCase");
        }
        else{
            System.out.println("No LowerCase");
        }
    }
}

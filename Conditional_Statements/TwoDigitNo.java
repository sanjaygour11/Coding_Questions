package Conditional_Statements;

import java.util.Scanner;

public class TwoDigitNo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        if(n>=10 && n<=99 ){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}

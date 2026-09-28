package Conditional_Statements;

import java.util.Scanner;

public class NoEndZero {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Ente the no.");


        int n=scan.nextInt();
        if(n%10==0){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}

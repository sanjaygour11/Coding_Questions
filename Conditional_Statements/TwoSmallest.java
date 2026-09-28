package Conditional_Statements;

import java.util.Scanner;

public class TwoSmallest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int n1=scan.nextInt();
        if(n<n1){
            System.out.println(n);
        }
        else{
            System.out.println(n1);
        }
    }
}

package Loop;

import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no.");
        int n=sc.nextInt();
        System.out.println("Enter the second no.");
        int n1=sc.nextInt();
        int r=n>n1?n:n1;

        for(int i=r;i>=1;i--){
            if(n%i==0 && n1%i==0){
                System.out.println(i);
                break;
            }
        }


    }
}

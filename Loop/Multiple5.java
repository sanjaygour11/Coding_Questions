package Loop;

import java.util.Scanner;

public class Multiple5 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the no.");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i*5);

        }
    }
}

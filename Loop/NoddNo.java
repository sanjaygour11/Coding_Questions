package Loop;

import java.util.Scanner;

public class NoddNo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no n");

        int n=scan.nextInt();
        for(int i=1;i<=n*2;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}

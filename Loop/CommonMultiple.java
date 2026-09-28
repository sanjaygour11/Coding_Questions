package Loop;

import java.util.Scanner;

public class CommonMultiple {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no. u want ");
        int n=scan.nextInt();
        System.out.println("Enter the common m1");
        int c1=scan.nextInt();
        System.out.println("Enter the common m2");
        int c2=scan.nextInt();

        //range is 1000 less only
        int count=0;
        for(int i=1;i<=1000;i++){

            if(i%c1==0 && i%c2==0){
                System.out.print(i+" ");
                count++;
            }
            if(count==n){
                break;
            }

        }

    }
}

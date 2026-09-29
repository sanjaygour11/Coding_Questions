package Arrays_Traversal;

import java.util.Scanner;

public class SumArrayStartToMiddle {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int ar[] = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<ar.length/2;i++){

           sum+=ar[i];
        }
        System.out.println("Sum=:"+sum);
    }
}

package Arrays_Traversal2;

import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int ar[] = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int i=0;i<ar.length;i++){

            if(ar[i]<min){
                min2=min;
                min=ar[i];
            }
            else if(ar[i]<min2){
                min2=ar[i];
            }
        }
        System.out.println("Second samllest is:"+min2);
    }
}

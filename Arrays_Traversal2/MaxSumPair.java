package Arrays_Traversal2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaxSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int ar[] = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){

            if(ar[i]>max){
                max2=max;
                max=ar[i];
            }
            else if(ar[i]>max2){
                max2=ar[i];
            }
        }
        System.out.println("Max sum is:"+(max+max2));
        
    }
}

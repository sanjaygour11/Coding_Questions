package Arrays_Traversal;

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size= sc.nextInt();

        float ar[]=new float[size];

        for(int i=0;i<ar.length;i++){
            ar[i]= sc.nextFloat();
        }
        float sum=0.0f;
        for (int i=0;i<ar.length;i++){
            sum+=ar[i];
        }
        System.out.printf("%.2f",sum/size);
    }
}

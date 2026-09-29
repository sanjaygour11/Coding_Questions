package Arrays_Traversal;

import java.util.Scanner;

public class PrintEvenIndexArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size");
        int size= sc.nextInt();

        int ar[]=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        System.out.println("Array Even Index Element are:");
        for(int i=0;i<ar.length;i++){
            if(i%2==0){
                System.out.print(ar[i]+" ");
            }
        }
    }
}

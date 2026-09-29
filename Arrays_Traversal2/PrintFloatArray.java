package Arrays_Traversal2;

import java.util.Scanner;

public class PrintFloatArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");

        int size = sc.nextInt();

        float ar[] = new float[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextFloat();
        }
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}

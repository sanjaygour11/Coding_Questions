package Arrays_Traversal2;

import java.util.Scanner;

public class OddIndexElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int ar[] = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        for(int i=0;i<ar.length;i++)
        {
            if(i%2!=0){
                System.out.print(ar[i]+" ");
            }
        }
    }
}

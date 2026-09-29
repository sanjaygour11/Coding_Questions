package Arrays_Traversal;

import java.util.Scanner;

public class ProductElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();

        int ar[] = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int pro=1;
        for(int i=0;i<ar.length;i++){

            pro=pro*ar[i];
        }
        System.out.println("Product is:"+pro);
    }
}

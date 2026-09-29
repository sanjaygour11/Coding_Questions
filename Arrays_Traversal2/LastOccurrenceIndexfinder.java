package Arrays_Traversal2;

import java.util.Scanner;

public class LastOccurrenceIndexfinder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int ar[] = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter the index no.");
        int k=sc.nextInt();
        int ind=0;
        for(int i=ar.length-1;i>=0;i--){

            if(ar[i]==k){
                ind=i;
                break;

            }
        }
        System.out.println("Index no is:"+(ind));
    }
}

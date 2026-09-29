package Arrays_Traversal2;

import java.util.Scanner;

public class OccurrenceOfSmallestNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int ar[] = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int max=ar[0];
        for(int i=0;i<ar.length;i++){
            if(ar[i]<max){
                max=ar[i];
            }
        }
        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==max){
                count++;
            }
        }
        System.out.println("Occurrence of smallest no."+count);
    }
}

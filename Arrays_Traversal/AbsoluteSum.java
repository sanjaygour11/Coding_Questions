package Arrays_Traversal;

import java.util.Scanner;

public class AbsoluteSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int size= sc.nextInt();

        int ar[]=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<0){
                sum=sum+(-ar[i]);
            }else{
                sum+=ar[i];
            }
        }
        System.out.println("sum=:"+sum);
    }
}

package Loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NprimeNo {

    public static boolean checkPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter the no. u want prime no.");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=1000;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
                count++;
            }
            if(count==n){
                break;
            }
        }

        
    }
}

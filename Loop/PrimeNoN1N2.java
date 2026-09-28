package Loop;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class PrimeNoN1N2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1 : ");
        int n1= sc.nextInt();
        System.out.println("Enter Number2 : ");
        int n2=sc.nextInt();

        for(int i=n1;i<=n2;i++){
            if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

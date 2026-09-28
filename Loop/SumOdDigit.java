package Loop;

import java.util.Scanner;

public class SumOdDigit {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the no.");
        int n=scan.nextInt();
      int rem=0;
      int sum=0;
        while(n!=0){
            rem=n%10;
            sum+=rem;
            n=n/10;
        }
        System.out.println("Sum of Digit=:"+sum);

    }
}


// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;

public class Subtract_sum_ofdigit {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a number : ");
        int num = in.nextInt();
        
        System.out.println("The diffrence = "+check(num));
        in.close();
        
    }

    static int  check(int n){
        int sum = 0;
        int product = 1;
        while(n>0){
            int number = n%10;
            sum = sum+number;
            product = product * number;
            n=n/10;
            
        }
        return product-sum;
    }
}

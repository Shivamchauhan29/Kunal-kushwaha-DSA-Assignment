// Take two numbers and print the sum of both.

import java.util.Scanner;

public class Sum_of_Two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("The sum of numbers = "+ (num1 + num2));
    }
}

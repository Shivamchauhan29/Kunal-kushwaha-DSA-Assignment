// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter two numbers :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int max=num1;
        if (max < num2) {
            max=num2;
        }

        System.out.println("Largest number = "+max);

        in.close();
    }
}

// Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to check even or odd :");
        int num = in.nextInt();

        if (num % 2 ==0) {
            System.out.println(num+ " is an even number.");
        }
        else{
            System.out.println(num+ " is a odd number.");
        }
    }
}

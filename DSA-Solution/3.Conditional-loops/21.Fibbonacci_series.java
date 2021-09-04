
// Program to print the fibbonacci series 

import java.util.*;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Fibonacci Series upto an nth term.");
        System.out.println("2.Fibonacci Series upto a given range.");
        int option = input.nextInt();
        if (option == 1 || option == 2) {
            if (option == 1) {
                System.out.println("Enter the number of term:");
                int term = input.nextInt();
                fibonacciSeries_term(term);
            }
            if (option == 2) {
                System.out.println("Enter the range:");
                int range = input.nextInt();
                for (int i = 0; fibo(i) < range; i++) {
                    System.out.print(fibo(i) + " ");
               }
            }
        }

        input.close();
    }
    

    public static void fibonacciSeries_term(int t) {
        int prev = 0;
        System.out.println(prev);
        int current = 1;
        System.out.println(current);
        for (int i = 2; i < t; i++) {
            int next = prev + current;
            System.out.println(next + " ");
            prev = current;
            current = next;

        }
    }

    public static int fibo(int r) {
        if (r <= 1) {
            return r;
        } else {
            return fibo(r - 1) + fibo(r - 2);
        }
    }
}

// Input currency in rupee and output in dollar.

import java.util.Scanner;

public class Currency_transfer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Assuming the price of 1 dollar = 70 ruppes

        System.out.println("Enter the amount in rupees");
        int rupee = in.nextInt();

        System.out.println("Your ₹ "+rupee+" = $"+(rupee / 70)+" Dollars");
    }
}

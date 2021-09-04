
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class Sum_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("continue entering  the number till you enter 0 : ");
        int number;
        int sum = 0;
        while ((number = in.nextInt()) != 0) {
            sum = sum + number;
        }
        System.out.println("Total Sum =" + sum);
        in.close();
    }
}

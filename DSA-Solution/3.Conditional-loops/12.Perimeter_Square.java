
// Perimeter of Square.

import java.util.Scanner;

public class Perimeter_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Side of the square:");
        double Side = in.nextDouble();

        double perimeter = 4 * Side;
        System.out.println("Perimeter of the Square is " + perimeter + " mtr.");
        in.close();
    }
}

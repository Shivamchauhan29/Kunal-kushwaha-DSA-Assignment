
// Perimeter of Equilateal Triangle

import java.util.Scanner;

public class Perimeter_Equilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the side of the Equilateral Triangle:");

        float side = in.nextFloat();
        double perimeter = 3 * side;

        System.out.println("Perimeter of the Equilateral Triangle is " + perimeter + " mtr.");
        in.close();
    }
}

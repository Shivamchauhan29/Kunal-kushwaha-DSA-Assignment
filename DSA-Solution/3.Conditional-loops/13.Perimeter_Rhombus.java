
// Perimeter of Rhombus.

import java.util.Scanner;

public class Perimeter_Rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Side of the rhombus:");
        float Side = in.nextFloat();

        double perimeter = 4 * Side;
        System.out.println("Perimeter of the Rhombus is " + perimeter + " mtr.");

        in.close();
    }
}

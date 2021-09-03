
// Perimeter of the rectangle

import java.util.Scanner;

public class Perimeter_Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle:");
        float Side = in.nextFloat();

        System.out.print("Enter the breadth of the rectangle:");
        float breadth = in.nextFloat();

        double perimeter = 2 * (Side + breadth);
        System.out.println("Perimeter of the Rectangle is " + perimeter + " mtr.");
        in.close();
    }
}


// Area of equilateral triangle

import java.util.Scanner;

public class Area_Equilateral {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // we know that the sides of the equilateral triangle are same

        System.out.println("Please enter the side of the equilateral triangle: ");
        float side = in.nextFloat();

        // We know that the area of the equilateral triangle = (1.732 * side * side ) / 4 , therefore
        double area = (1.732 * side * side)/4 ;
        System.out.println("The area of the equilatral triangle  = "+area);

        in.close();
    }
}

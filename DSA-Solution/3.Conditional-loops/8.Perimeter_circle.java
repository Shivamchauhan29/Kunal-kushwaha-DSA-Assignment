
// Perimeter of the circle 

import java.util.Scanner;

public class Perimeter_circle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        
        System.out.println("Please enter the radius of the circle : ");
        float radius = in.nextFloat();

        // The formula for perimeter of circle = 2 * pie * radius

        double perimeter = 2 * 3.145 * radius;
        System.out.println("The perimeter of the circle = "+perimeter);

        in.close();
    }
}

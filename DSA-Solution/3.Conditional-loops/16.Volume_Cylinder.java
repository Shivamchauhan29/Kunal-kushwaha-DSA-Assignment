
// Volume of cylinder java program.

import java.util.Scanner;

public class Volume_Cylinder {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // We know that the volume of the cylinder V= π * r * r * h , therfore 

        System.out.println("Please enter the radius and height of the cylinder ");
        double radius = in.nextDouble();
        double height = in.nextDouble();

        double volume = 3.145 * radius * radius * height;
        System.out.println("The volume of the cylinder = "+volume);

        in.close();
    }
}

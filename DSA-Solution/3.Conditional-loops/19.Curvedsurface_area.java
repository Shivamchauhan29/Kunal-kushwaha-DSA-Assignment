// Program of curved surface area of cylinder.

import java.util.*;

public class Curvedsurface_area {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float PI = 3.1415f;

        System.out.print("Enter the base radius of the cylinder(in mtr.):");
        float baseRad = input.nextFloat();

        System.out.print("Enter the height of the cylinder(in mtr.):");
        float height = input.nextFloat();

        // calculating the surface area of cylinder with the formula
        float curvedSurfaceAreaCylinder = 2 * PI * baseRad * height;
        System.out.println("The curved surface area of the cylinder is " + curvedSurfaceAreaCylinder + " mtr.²");
        input.close();

    }
}

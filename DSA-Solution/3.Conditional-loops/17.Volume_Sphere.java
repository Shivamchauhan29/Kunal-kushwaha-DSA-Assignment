
// Volume of sphere

import java.util.Scanner;

public class Volume_Sphere {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float pie = 3.145f;

        System.out.print("Enter the radius of the sphere:");
        float radius = in.nextFloat();
        float volume = 4 / 3 * pie * radius * radius * radius;
        System.out.println("Volume of the Sphere  is " + volume + " mtr.³");

        in.close();
    }
}

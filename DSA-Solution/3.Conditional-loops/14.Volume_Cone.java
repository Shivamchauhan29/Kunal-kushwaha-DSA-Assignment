
// Volume of cone 

import java.util.Scanner;

public class Volume_cone {
    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);

        System.out.println("please enter the height and the radius of the cone :");

        double height = in.nextDouble();
        double radius = in.nextDouble();

        // Calculating the volume of the cone 

        double volume = (3.145 * radius * radius *height) / 3;
        System.out.println("The volume of the cone = "+volume);

        in.close();
    }
}

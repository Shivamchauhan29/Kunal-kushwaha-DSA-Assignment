
// Volume of Prism

import java.util.Scanner;

public class Volume_Prism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // We know that the formula of volume of the prism = (base * height * length) / 2 , therfore

        System.out.println("Enter the base height and length of the prism ");
        double base = in.nextDouble();
        double height = in.nextDouble();
        double length = in.nextDouble();

        // calculating the volume of the prism
        double volume = (base * height * length) / 2;

        System.out.println("The volume of the prism = "+volume);
        in.close();
    }
}

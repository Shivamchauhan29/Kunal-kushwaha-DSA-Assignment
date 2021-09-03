
// Volume of the pyramid

import java.util.Scanner;

public class Volume_Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base area of the pyramid:");
        float baseArea = in.nextFloat();

        System.out.print("Enter the height of the pyramid:");
        float height = in.nextFloat();

        float volume = baseArea * height;
        System.out.println("Volume of the pyramid is " + volume + " mtr.³");

        in.close();
    }
}

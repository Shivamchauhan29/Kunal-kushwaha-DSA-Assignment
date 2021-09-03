
// Area Of Isoscles Triangle Java Program

import java.util.Scanner;

public class Area_isoscles {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base and height of the triangle :");

        float base = in.nextFloat();
        float height = in.nextFloat();

        float area = (base * height) / 2;
        System.out.println("The area of the triangle = "+area);

        in.close();
    }
}


// Area of Rhombus java program

import java.util.Scanner;

public class Area_rhombus {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Lets consider two diagonal of the rhombus p and q respectively

        System.out.println("Please enter the diagonal P and Q respectively : ");

        float p = in.nextFloat();
        float q = in.nextFloat();

        float area = (p * q) / 2; //This is the formula for the area of rhombus

        System.out.println("The area of the rhombus  = "+area);

        in.close();
    }
}

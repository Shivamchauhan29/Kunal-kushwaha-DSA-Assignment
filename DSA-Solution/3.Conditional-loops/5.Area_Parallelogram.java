
// Area of Parallelogram java program

import java.util.Scanner;

public class Area_Parallelogram{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the base and height of the parallelogram : ");

        float base = in.nextFloat();
        float height = in.nextFloat();

        float area = base * height;

        System.out.println("The area of parallelogram = "+area);
        in.close();
    }
}

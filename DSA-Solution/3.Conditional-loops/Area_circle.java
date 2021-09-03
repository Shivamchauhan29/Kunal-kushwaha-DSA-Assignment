
// Area Of Circle Java Program

import java.util.Scanner;

public class Area_circle {
    public static void main(String[] args) {
        
        Scanner in  = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle :");
        float radius = in.nextFloat();
        float pie = 3.14f;

        // we know that the value of the pie = 3.14 , therefore

        float area = pie * radius * radius ;
        System.out.println("The area of circle is = "+area);

        in.close();
    }
}

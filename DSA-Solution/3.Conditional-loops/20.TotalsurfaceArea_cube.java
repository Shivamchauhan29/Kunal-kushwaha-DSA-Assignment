
import java.util.Scanner;

public class Totalsurfacearea_cube{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the edge length of the cube(in mtr.):");
        float side = in.nextFloat();
        float TotalSA = 6 * side * side;
        System.out.println("The total surface area of the cube is " + TotalSA + " mtr.²");

        in.close();
    }
}

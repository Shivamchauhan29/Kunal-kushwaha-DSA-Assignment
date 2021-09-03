
// Perimeter of the Parallelogram

import java.util.Scanner;

public class Perimeter_Parallelogram{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Perimeter of Parallelogram = 2( a + b )
        System.out.println("enter the length and breadth of the parallelogram");

        float length = in.nextInt();
        float breadth = in.nextInt();

        float perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the parallelogram = "+perimeter);

        in.close();
        
    }
}

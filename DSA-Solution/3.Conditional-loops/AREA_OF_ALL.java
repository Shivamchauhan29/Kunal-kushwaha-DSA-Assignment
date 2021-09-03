

// This java program contains the code for finding the area of the various shapes 

import java.util.Scanner;

public class AREA_OF_ALL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("A.Area of Circle");
        System.out.println("B.Area of Triangle");
        System.out.println("C.Area of Parallelogram:");
        System.out.println("D.Area of Rectangle");
        System.out.println("E.Area of Equilateral triangle");
        System.out.println("F.Area of Rhombus");
        

        System.out.print("Choose the option given above:");
        char option = in.next().trim().charAt(0);
        if (option == 'A' || option == 'a' || option == 'B' || option == 'b' || option == 'C' || option == 'c' || option == 'D' || option == 'd' || option == 'E' || option == 'e' || option == 'F'|| option == 'f') {
                    
            // Area of circle
            if (option == 'A' || option == 'a') {
                System.out.println("Please enter the radius of the circle :");
                float radius = in.nextFloat();
                float pie = 3.14f;

                // we know that the value of the pie = 3.14 , therefore

                float area = pie * radius * radius ;
                System.out.println("The area of circle is = "+area);


            }

            // Area of Triangle
            if (option == 'B' || option == 'b') {
                System.out.println("Enter the base and height of the triangle :");

                float base = in.nextFloat();
                float height = in.nextFloat();

                float area = (base * height) / 2;
                System.out.println("The area of the triangle = "+area);


            }

            // Area of Parallelogram
            if (option == 'C' || option == 'c') {
                System.out.println("Please enter the base and height of the parallelogram : ");

                float base = in.nextFloat();
                float height = in.nextFloat();

                float area = base * height;

                System.out.println("The area of parallelogram = "+area);

            }

            // Area of Rectangle 
            if (option == 'D' || option == 'd') {
                System.out.println("Please enter the length and breadth of the rectangle : ");
                float length = in.nextInt();
                float breadth = in.nextInt();

                float area = length * breadth;

                System.out.println("The area of the rectangle  = "+area);

            }

            // Area of Equilateral Triangle
            if (option == 'E' || option == 'e') {
                System.out.println("Please enter the side of the equilateral triangle: ");
                float side = in.nextFloat();

                // We know that the area of the equilateral triangle = (1.732 * side * side ) / 4 , therefore
                double area = (1.732 * side * side)/4 ;
                System.out.println("The area of the equilatral triangle  = "+area);

            }

            // Area of Rhombus
            if (option == 'F' || option == 'f') {
                System.out.println("Please enter the diagonal P and Q respectively : ");

                float p = in.nextFloat();
                float q = in.nextFloat();

                float area = (p * q) / 2; //This is the formula for the area of rhombus

                System.out.println("The area of the rhombus  = "+area);

            }

        }
        else{
            System.out.println("You have entered Wrong character for the specific function:");
        }
        in.close();
    }
}

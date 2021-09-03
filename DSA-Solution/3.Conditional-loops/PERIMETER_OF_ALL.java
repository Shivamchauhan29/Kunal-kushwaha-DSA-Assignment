
// Program to calculate the perimeter of almost of the figures in one place

import java.util.*;

public class PERIMETER_OF_ALL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("A.Perimeter of Circle");
        System.out.println("B.Perimeter of Equilateral Triangle");
        System.out.println("C.Perimeter of Parallelogram:");
        System.out.println("D.Perimeter of Rectangle");
        System.out.println("E.Perimeter of Square");
        System.out.println("F.Perimeter of Rhombus");
        double PI = 3.1415926535897;

        
        System.out.print("Choose the option given above:");
        char option = in.next().trim().charAt(0);
        if (option == 'A' || option == 'a' || option == 'B' || option == 'b' || option == 'C' || option == 'c'
                || option == 'D' || option == 'd' || option == 'E' || option == 'e' || option == 'F'
                || option == 'f') {
            if (option == 'A' || option == 'a') {
                System.out.print("Enter the radius of the circle:");
                double radius = in.nextDouble();
                double perimeter = 2 * PI * radius;
                System.out.println("Perimeter of the circle is " + perimeter + " mtr.");

            }
            if (option == 'B' || option == 'b') {
                System.out.print("Enter the side of the Equilateral Triangle:");
                float side = in.nextFloat();
                double perimeter = 3 * side;
                System.out.println("Perimeter of the Equilateral Triangle is " + perimeter + " mtr.");

            }
            if (option == 'C' || option == 'c') {
                System.out.print("Enter the adjacent side length  of the parallelogram:");
                float adjacentSide = in.nextFloat();
                System.out.print("Enter the base length  of the parallelogram:");
                float baseLength = in.nextFloat();
                double perimeter = 2 * (adjacentSide + baseLength);
                System.out.println("Perimeter of the parallelogram is " + perimeter + " mtr.");

            }
            if (option == 'D' || option == 'd') {
                System.out.print("Enter the length of the rectangle:");
                float Side = in.nextFloat();
                System.out.print("Enter the breadth of the rectangle:");
                float breadth = in.nextFloat();
                double perimeter = 2 * (Side + breadth);
                System.out.println("Perimeter of the Rectangle is " + perimeter + " mtr.");

            }
            if (option == 'E' || option == 'e') {
                System.out.print("Enter the Side of the square:");
                double Side = in.nextDouble();
                double perimeter = 4 * Side;
                System.out.println("Perimeter of the Square is " + perimeter + " mtr.");

            }
            if (option == 'F' || option == 'f') {
                System.out.print("Enter the Side of the rhombus:");
                float Side = in.nextFloat();
                double perimeter = 4 * Side;
                System.out.println("Perimeter of the Rhombus is " + perimeter + " mtr.");

            }

            
        }
        else{
            System.out.println("Wrong input !! Try again...😞");
        }

        in.close();
       
    }
}

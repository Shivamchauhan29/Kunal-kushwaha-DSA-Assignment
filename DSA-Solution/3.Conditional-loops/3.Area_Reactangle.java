
// Area Of Rectangle Program


import java.util.Scanner;

public class Area_Reactangle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the length and breadth of the rectangle : ");
        float length = in.nextInt();
        float breadth = in.nextInt();

        float area = length * breadth;

        System.out.println("The area of the rectangle  = "+area);
        in.close();
    }
}


// Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Largest_from_all {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number;
        int max=0;

        while ((number = in.nextInt()) != 0) {
            if (max < number) {
                max=number;
                
            }
            
        }
        System.out.println("The largest number =" + max);

        in.close();
    }
}

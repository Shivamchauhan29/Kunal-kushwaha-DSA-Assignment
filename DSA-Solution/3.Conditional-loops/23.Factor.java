
// To find the factor of a number 

import java.util.Scanner;

public class Factor_ofnumber {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = in.nextInt();
        System.out.println("Factors of " + number + " are:");
        int count = 1;
        while (count <= number) {

            if (number % count == 0) {
                System.out.print(count + " ");
            }
            count++;
        }
    }
}

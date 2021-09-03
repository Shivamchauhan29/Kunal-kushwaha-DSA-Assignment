// Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Name_greeting {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a name: ");
        String name = in.next();

        System.out.println("You are welcome ! "+name);
    }
}


// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number to multiply and get the table : ");
        int num = in.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(num+ " x " +i+ "= " +(i*num));
        }


    }
}

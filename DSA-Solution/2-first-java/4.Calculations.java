// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter + - * /");
        char var = in.next().charAt(0);

        System.out.println("Please enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

       if (var == '+') {
           System.out.println(num1 + num2);   
       }
       else if (var == '-') {
           System.out.println(num1 - num2);
       } 
       else if (var == '*'){
           System.out.println(num1 * num2);
       }
       else if (var == '/') {
           if (num1 > num2) {
               System.out.println(num1 / num2);
           }
           else{
               System.out.println(num2 / num1);
           }
       }
       else{
           System.out.println("You entered a invalid input! ");
       }
        
    }
}

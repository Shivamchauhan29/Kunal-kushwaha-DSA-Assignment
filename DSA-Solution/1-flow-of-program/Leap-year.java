
import java.util.Scanner;

// Input a year and find whether it is a leap year or not.

public class Leap_year{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter a year : ");
        int year = in.nextInt();
        
        boolean ans = checkyear(year);

        if (ans == true) {
            System.out.println(year + " is a Leap Year.");
        }
        else{
            System.out.println(year  +" is not a leap year.");
        }


        in.close();
    }

    static boolean checkyear(int year){
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            }
        }
        else{
            if (year % 4 == 0) {
                return true;
            }
        }

        return false;
    }
}


import java.util.Scanner;

/**
 * ProChall13 class does the following:
 * 1) Add steps here
 * 
 * @author Jacob Ricketts, jricketts@student.sdccd.edu
 * @version v1.0
 * @since 9/13/2026
 */

public class ProChall13{  //Remove _Starter. The Ch2 Ref Guide will be a BIG help
    public static void main (String[] args){
        //double vars for meal, total, taxAmount, tipAmount
        final double TAX = 0.0675;
        double meal;
        double total;
        double taxAmount;
        double tipAmount;
        //create a double constant for TIP as well that is 20%
        final double TIP = 0.20;
        //Create a Scanner object to get keyboard input
        Scanner keyboard = new Scanner(System.in);
        ////Get input section
        System.out.print("Enter meal amount: $");
        //assign meal var with a double from the Scanner object
        //assign taxAmount var with a double from meal * ???
        //assign tipAmount var with a double from meal * ???
        //assign total var with the sum of ???
        meal = keyboard.nextDouble();
        taxAmount = meal * TAX;
        tipAmount = TIP * (meal + taxAmount);
        total = meal + taxAmount + tipAmount;
        System.out.printf("\nThe tax is: $%,.2f", taxAmount);  
        //// $%,.2f is a place holder for $ then puts a , 
        //// after 3 places (as needed) and rounds to 2 decimal places
        System.out.printf("\nThe tip amount is: $%,.2f", tipAmount);  
        System.out.printf("\nThe meal cost with tax and tip is: $%,.2f", total);
    }
}
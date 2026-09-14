import java.util.Scanner;

/**
 * ProChall15 class does the following:
 * 1) Intakes the shares
 * 2) Intakes the share price
 * 3) Calculates the Total cost of shares
 * 4) Calculates the comission cost
 * 5) Calculates the total cost of the shares and commission
 * 
 * @Jacob Ricketts, jricketts@student.sdccd.edu
 * @version v1.0
 * @since 9/13/2026
 */

public class ProChall15{  //For Replit change ProChall5 to Main.  The Ch2 Ref Guide will be a BIG help
    public static void main (String[] args){
        ////variables
        //double vars for pricePerShare, totalCostShares, commission, total
        //create a constant (final double) for COMM_RATE set to 2% 
        int shares;
        double pricePerShare;
        double totalCostShares;
        double commission;
        double total;
        final double COMM_RATE = 0.02;
        
        Scanner keyboard = new Scanner(System.in);
        
        ////get input for number of shares and cost per share using a Scanner object
        
        System.out.println("Enter number of shares purchased: ");
        shares = keyboard.nextInt();
        System.out.println("Enter price per share: $");
        pricePerShare = keyboard.nextDouble();
        
        ////computations
        //assign totalCostShares with product of what and what?
        //assign commission with product of what (hint step above) and what?
        //assign total with addition of what and what (hint look at above two values)
        
        totalCostShares = shares * pricePerShare;
        commission = totalCostShares * COMM_RATE;
        total = commission + totalCostShares;

        ////display output
        System.out.printf("Total cost of shares are: $%,.2f\nCommission cost is: $%,.2f\nTotal Cost is: $%,.2f",totalCostShares, commission, total);
    }//// end main()
}//// end class
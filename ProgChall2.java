import java.util.Scanner; 
/**
 * This takes your name, and outputs the initials, and more.
 *
 * @author Jacob Ricketts, jricketts@student.sdccd.edu
 * @version 1.0
 */
public class ProgChall2
{
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;
        char firstInit;
        char middleInit;
        char lastInit;
        System.out.println("Enter your first name: ");
        Scanner keyboard = new Scanner(System.in);
        firstName = keyboard.nextLine();
        System.out.println("Enter your middle name: ");
        middleName = keyboard.nextLine();
        System.out.println("Enter your last name: ");
        lastName = keyboard.nextLine();
        System.out.println("My name is " + firstName +" " + middleName + " "+ lastName);
        firstInit = firstName.charAt(0); 
        middleInit = middleName.charAt(0);
        lastInit = lastName.charAt(0);
        System.out.println("My initials are " + firstInit + middleInit + lastInit);
        
        
    }
    
}
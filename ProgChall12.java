import java.util.Scanner;
/**
 * This takes a city and outputs its amount of characters, first character, and in upper and lower case.
 *
 * @author Jacob Ricketts, jricketts@student.sdccd.edu
 * @version 1.0
 */
public class ProgChall12
{
    public static void main(String[] args)
    {
        String city;
        String cityUpper;
        String cityLower;
        char firstLetter;
        int characters;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a city: ");
        city = keyboard.nextLine();
        characters = city.length();
        cityUpper = city.toUpperCase();
        cityLower = city.toLowerCase();
        firstLetter = city.charAt(0);
        System.out.println("The city entered has: " + characters + " chars.");
        System.out.println("In upper case: " + cityUpper);
        System.out.println("In lower case: " + cityLower);
        System.out.println("First character: " + firstLetter);
    }
}
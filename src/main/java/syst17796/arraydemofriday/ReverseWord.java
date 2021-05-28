package syst17796.arraydemofriday;
import java.util.Scanner;
/**
 * @author Chris Klammer. "In the beginning the Universe was created. This has
 * made a lot of people very angry and has been widely regarded as a bad move."
 * - Douglas Adams (The Restaurant at the End of the Universe, 1980).
 */
public class ReverseWord
{
    public static void main (String[] args)
    {

        Scanner inKeys = new Scanner(System.in);


        System.out.println("Enter a phrase to reverse.");
        String wordToReverse = inKeys.nextLine();

        // Creates a char array from the user input
        char[] letters = new char[wordToReverse.length()];
        for (int i = 0; i < wordToReverse.length(); i++) {
            letters[i] = wordToReverse.charAt(i);
        }

        for (int i = wordToReverse.length() - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }

}

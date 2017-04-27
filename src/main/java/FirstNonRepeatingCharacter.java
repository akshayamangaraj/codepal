import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingChar(String word) {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            /*if (repeating.contains(letter)) {
                continue;
                }*/
            if (nonRepeating.contains(letter)) {
                nonRepeating.remove((Character)letter);
                repeating.add(letter);
                }
            else {
                nonRepeating.add(letter);
                }
            }
        return nonRepeating.get(0);
        }



    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char character = FirstNonRepeatingCharacter.firstNonRepeatingChar(word);
        System.out.println(character);

    }

}

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class AllPermutationsOfAStringPractice {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        AllPermutationsOfAStringPractice object = new AllPermutationsOfAStringPractice();
        System.out.println(object.findPermutations(scanner.next()).toString());

    }

    private HashSet<String> findPermutations(String str) {
        HashSet<String> set = new HashSet<>();
        if (str == null || str.length() == 0) {
            set.add("");
            return set;
        }

        Character first = str.charAt(0);
        String remaining = str.substring(1);
        HashSet<String> words = findPermutations(remaining);
        for (String word : words) {
            for (int i = 0; i <=word.length(); i++) {
                String prefix = word.substring(0, i);
                String suffix = word.substring(i);
                set.add(prefix+first+suffix);

            }

        }
        return set;

    }

}

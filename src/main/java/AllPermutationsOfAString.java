import java.util.HashSet;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class AllPermutationsOfAString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String string = "subrat";
        AllPermutationsOfAString permutation = new AllPermutationsOfAString();
        HashSet<String> result = permutation.findPermutations(string);
        System.out.println(result.toString());

    }

    private HashSet<String> findPermutations(String string) {
        HashSet<String> permutations = new HashSet<>();
        if (string == null || string.length() == 0) {
            permutations.add("");
            return permutations;
        }

        Character first = string.charAt(0);
        String remaining = string.substring(1);
        HashSet<String> words = findPermutations(remaining);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {

                String prefix = word.substring(0, i);
                String suffix = word.substring(i);
                permutations.add(prefix+first+suffix);
            }
        }
        return permutations;

    }

}
			
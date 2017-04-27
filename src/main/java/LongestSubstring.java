/**
 *
 */

/**
 * @author sparid2
 *
 */
public class LongestSubstring {

    public static String getLongestSubstringNonRepeatingCharsNaive(String str) {
        String longestSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (hasRepeatingChars(str, i, j)) {
                    break;
                } else if (longestSubstring.length() < j - i + 1) {
                    longestSubstring = str.substring(i, j + 1);
                }
            }
        }
        return longestSubstring;
    }

    private static boolean hasRepeatingChars(String str, int start, int end) {
        boolean[] isCharPresent = new boolean[256];
        for (int i = 0; i < 256; i++) {
            isCharPresent[i] = false;
        }
        for (int i = start; i <= end; i++) {
            if (isCharPresent[str.charAt(i)]) {
                return true;
            } else {
                isCharPresent[str.charAt(i)] = true;
            }
        }
        return false;
    }

    public static String getLongestSubstringNonRepeatingChars(String str) {

        if (str == null) {
            return null;
        }

        int n = str.length();
        if (n < 2) {
            return str;
        }

        int[] charIndexes = new int[256];
        for (int i = 0; i < n; i++) {
            charIndexes[i] = -1;
        }

        charIndexes[str.charAt(0)] = 0;

        int currLength = 1;
        int maxLength = 1;
        int prevIdx = 0;
        int startIdx = 0;

        for (int i = 1; i < n; i++) {
            prevIdx = charIndexes[str.charAt(i)];
            if (prevIdx == -1 || i - currLength > prevIdx) {
                currLength++;
            } else {
                if (currLength > maxLength) {
                    maxLength = currLength;
                    startIdx = i - maxLength;
                }
                currLength = i - prevIdx;
            }
            charIndexes[str.charAt(i)] = i;
        }

        if (currLength > maxLength) {
            maxLength = currLength;
            startIdx = n - maxLength;
        }

        return str.substring(startIdx, startIdx + maxLength);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "ABCDABDEFGCABD";

        String longestSubstring = getLongestSubstringNonRepeatingChars(str);
        System.out.println("Longest substring non repeating chars by linear time method:\t" + longestSubstring);

    }

}

import java.util.Arrays;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class AnagramString {

    private static boolean isAnagram(String firstString, String secondString){

        char[] firstCharArray = firstString.toCharArray();
        char[] secondCharArray = secondString.toCharArray();

        if(firstString.length()== secondString.length()){
            Arrays.sort(firstCharArray);
            Arrays.sort(secondCharArray);
            if(Arrays.equals(firstCharArray, secondCharArray)){
                return true;
            }
        }

        return false;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(isAnagram("subrat","shakti"));

    }

}

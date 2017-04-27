import java.util.ArrayList;
import java.util.List;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class Anagram2ndWay {

    private static List<Character> list1 = new ArrayList<>();
    private static List<Character> list2 = new ArrayList<>();

    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean isAnagram = isAnagram("abcd", "adcb");

    }

    private static boolean isAnagram(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        int counter = 0;



        for (char c : ch1) {



        }


        return false;

    }

}

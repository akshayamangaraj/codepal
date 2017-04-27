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
public class FirstNONReaptingCharacter {

    private static Character getTheFirstNonReaptingCharacter(String word){

        Set<Character> set = new HashSet<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(set.contains(ch)){
                continue;
            }
            if(list.contains(ch)){
                //list.remove(ch);
                list.remove((Object)ch);
                set.add(ch);
            }else{
                list.add(ch);
            }
        }

        return list.get(0);

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word :");
        String word = scanner.nextLine();
        char ch = FirstNONReaptingCharacter.getTheFirstNonReaptingCharacter(word);
        System.out.println(ch);


    }

}

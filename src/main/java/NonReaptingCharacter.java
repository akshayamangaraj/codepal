import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class NonReaptingCharacter {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = scanner.nextLine();
        NonReaptingCharacter nonReaptingCharacter = new NonReaptingCharacter();
        nonReaptingCharacter.find(string);

    }

    private void find(String string) {
        Set<Character> set = new TreeSet<>();
        List<Character> list = new ArrayList<>();
        char[] data = string.toCharArray();
        for (char c : data) {
            if(list.contains(c)){
                list.remove((Character)c);
                set.add(c);
            }else{
                list.add(c);
            }
        }

        System.out.println(list.get(0));

    }

}

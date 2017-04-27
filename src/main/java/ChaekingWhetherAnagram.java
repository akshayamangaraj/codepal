import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class ChaekingWhetherAnagram {

    private boolean isAnagram(String str, String anotherString){

        int length = str.length();
        int size = anotherString.length();


        Map<Character, Integer> firstMap = new HashMap();
        Map<Character, Integer> secondMap = new HashMap<Character, Integer>();
        char[] char1 = str.toCharArray();
        char[] char2 = anotherString.toCharArray();
        for (Character element : char1) {
            if(firstMap.containsKey(element)){
                firstMap.put(element, firstMap.get(element)+1);
            }else{
                firstMap.put(element, 1);
            }
        }

        for (Character element : char2) {
            if(secondMap.containsKey(element)){
                secondMap.put(element, secondMap.get(element)+1);
            }else{
                secondMap.put(element, 1);
            }
        }

        if(length == size &&  isStructureSame(firstMap,secondMap)){
            return true;
        }


        return false;

    }

    private boolean isStructureSame(Map<Character,Integer> map1, Map<Character,Integer> map2) {

        for (Character key : map1.keySet()) {
            if(map2.keySet().contains(key)){
                map2.remove(key);
            }
        }

        if(map2.isEmpty()){
            return true;
        }





        return false;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ChaekingWhetherAnagram chaekingWhetherAnagram = new ChaekingWhetherAnagram();
        String anagram = "abcd";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = sc.nextLine();
        boolean flag = chaekingWhetherAnagram.isAnagram(string,anagram);
        if(flag){
            System.out.println("it's a anagram");
        }else {
            System.out.println("it's not a anagram");
        }

    }

}

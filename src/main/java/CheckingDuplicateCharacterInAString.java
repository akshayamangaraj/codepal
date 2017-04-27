import java.util.HashMap;
import java.util.Map;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class CheckingDuplicateCharacterInAString {

    public boolean hasDuplicateChars(String s){
        boolean flag = false;
        Map<Character,Integer> map = new HashMap();
        char[] char1 = s.toCharArray();
        for (Character element : char1) {
            if(map.containsKey(element)){
                map.put(element, map.get(element)+1);

            }else{
            map.put(element, 1);
            }
        }

        for (char c : map.keySet()) {
            if(map.get(c)>1){
                flag = true;
            }
        }

        return flag;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CheckingDuplicateCharacterInAString string = new CheckingDuplicateCharacterInAString();
        boolean value1 = string.hasDuplicateChars("great");
        boolean value2 = string.hasDuplicateChars("greatg");
        System.out.println(value1+" : "+value2);


    }

}

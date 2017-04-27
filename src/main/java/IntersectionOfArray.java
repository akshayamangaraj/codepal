import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class IntersectionOfArray {

    private static Map<Integer,Integer> map = new HashMap<>();

    /**
     * @param args
     */
    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5,6};
        int[] array1 = new int[]{5,6,7,8,9};
        List<Integer> list = (List) Arrays.asList(array1);
        Set set = new TreeSet<>();
        for (int i : array) {
            if(list.contains(i)){
                set.add(i);
            }
        }

    }

}

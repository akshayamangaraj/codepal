import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class ConvertMapToList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Map map = new HashMap<String, String>();
        map.put("Reyansh", "Parida");
        map.put("Shakti", "Das");
        map.put("Subrat", "Parida");
        List<Entry> list = new ArrayList<Entry>(map.entrySet());
        System.out.println(list);


    }

}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class how_to_extract_numeric_values_from_input_string {

    /**
     * @param args
     */
    public static void main(String[] args) {
       // String str=" abc d 1234567890pqr 54897";
        /*Pattern pattern = Pattern.compile("\\w+([0-9]+)\\w+([0-9]+)");
        Matcher matcher = pattern.matcher(str);
        System.out.println(matcher.groupCount());
        //System.out.println(matcher.find());
        for(int i = 0 ; i < matcher.groupCount(); i++) {
          matcher.find();
          System.out.println(matcher.group());
        }
*/
        String str=" abc d 1234567890pqr 54897";

Pattern p = Pattern.compile("(\\d+)");
Matcher m = p.matcher(str);
while(m.find())
{
    System.out.println(m.group(1));
}
    }

}

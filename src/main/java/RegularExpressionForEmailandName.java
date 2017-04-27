import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class RegularExpressionForEmailandName {

    /**
     * @param args
     */
    public static void main(String[] args) {
         String regexPattern = "@gmail.com$";
         Pattern p = Pattern.compile(regexPattern);

         Scanner in = new Scanner(System.in);
         int N = in.nextInt();
         List<String> accounts = new ArrayList<>(N);
         for(int n = 0; n < N; n++){
             String firstName = in.next();
             String emailID = in.next();

             if (p.matcher(emailID).find()) {
                 accounts.add(firstName);
             }
         }
         Collections.sort(accounts);
         for (int i = 0; i < accounts.size(); i++) {
             System.out.println(accounts.get(i));
         }
         in.close();
     }
 }

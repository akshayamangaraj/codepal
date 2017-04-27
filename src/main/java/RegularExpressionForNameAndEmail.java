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
public class RegularExpressionForNameAndEmail {

    private static List<EmailAndName> list = new ArrayList<>();

    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(new EmailAndName(scanner.next(), scanner.next()));
        }

        for (String string : getUserNames()) {
            System.out.println(string);
        }



    }

    private static List<String> getUserNames() {
        List<String> names = new ArrayList<>();
        Pattern p = Pattern.compile(".*@gmail.com");
        for (EmailAndName emailAndName : list) {
            if(p.matcher(emailAndName.getEmail()).matches()){
                names.add(emailAndName.getName());
            }
        }

        Collections.sort(names);

        return names;
    }

    private static class EmailAndName{
        private String name;
        private String email;

        public EmailAndName(String name, String email){
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }


    }

}

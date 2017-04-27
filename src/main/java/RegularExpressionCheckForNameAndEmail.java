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
class RegularExpressionCheckForNameAndEmail {

    String name;
    String email;

    public RegularExpressionCheckForNameAndEmail(String name, String email) {
        this.name = name;
        this.email = email;
    }

}

class solution {
    static List<RegularExpressionCheckForNameAndEmail> emailList;

    public static List<String> getGmailUsers() {

        List<String> names = new ArrayList<>();
        Pattern p = Pattern.compile(".*@gmail.com");
        for (RegularExpressionCheckForNameAndEmail e : emailList) {
            if (p.matcher(e.email).matches()) {
                names.add(e.name);
            }
        }

        Collections.sort(names);

        return names;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        emailList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            emailList.add(new RegularExpressionCheckForNameAndEmail(scanner.next(), scanner.next()));

        }
        scanner.close();

        for (String string : getGmailUsers()) {
            System.out.println(string);

        }

    }

}

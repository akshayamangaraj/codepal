import java.util.Scanner;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class ReverseAString {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scanner.next();
        ReverseAString obj = new ReverseAString();
        obj.reverse(str);

    }

    private void reverse(String str) {
        if(str.length()==1){
            System.out.print(str);
            return;
        }

        char ch = str.charAt(0);
        reverse(str.substring(1));
        System.out.print(ch);

    }

}

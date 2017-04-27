/**
 *
 */

/**
 * @author sparid2
 *
 */
public class ReverseAStringUsingRecursion {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ReverseAStringUsingRecursion obj = new ReverseAStringUsingRecursion();
        String rev =obj.reverseAString("Anish");
        System.out.println(rev);

    }

    private String reverseAString(String string) {

        String reverse = "";

        if(string.length()==1){
            return string;
        }

        reverse+=string.charAt(string.length()-1)+reverseAString(string.substring(0, string.length()-1));
        return reverse;


    }

}

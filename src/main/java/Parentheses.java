/**
 *
 */

/**
 * @author sparid2
 *
 */
public class Parentheses {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "((BCD)AE)" ;
        System.out.println("isValid: "  + isValid(str));
        str = ")(PH)N(X)" ;
        System.out.println("isValid: "  + isValid(str));
    }

    private static boolean isValid(String str) {
        if(str == null || str.length()==0){
            return true;
        }
        int n = str.length();
        int i=0;
        int counter = 0;
        while(i<n){
        	
        }
        return false;
    }

}

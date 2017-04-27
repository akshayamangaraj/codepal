/**
 *
 */

/**
 * @author sparid2
 *
 */
public class power {

    private static int power(int x, int n){

        if(n==0){
            return 1;
        }

        int v = pow(x,n/2);
        if(n%2==0){
            return v*v;
        }else{
            return v*v*x;
        }



    }

    private static int pow(int x, int i) {

        if(i<0){
            return 1/power(x, -i);
        }else{
            return power(x, i);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

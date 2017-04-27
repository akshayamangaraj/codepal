/**
 *
 */

/**
 * @author sparid2
 *
 */
public class MaxiumSubArray {


    public int maxSubArray(int[] A) {
           int newsum=A[0];
           int max=A[0];
           for(int i=1;i<A.length;i++){
               newsum=Math.max(newsum+A[i],A[i]);
               max= Math.max(max, newsum);
           }
           return max;
        }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // −2,1,−3,4,−1,2,1,−5,4

        int array[] ={ −2,1,−3,4,−1,2,1,−5,4};

        MaxiumSubArray maxiumSubArray = new MaxiumSubArray();
       // maxiumSubArray.maxSubArray(A);

    }

}

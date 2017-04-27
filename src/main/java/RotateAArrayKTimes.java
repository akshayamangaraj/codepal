import java.util.Arrays;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class RotateAArrayKTimes {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        int k=8;
        RotateAArrayKTimes object = new RotateAArrayKTimes();
        object.rotateKTimes(array,k);
        System.out.println(Arrays.toString(array));

    }

    private void rotateKTimes(int[] array, int k) {
        if(k<0){
            throw new IllegalArgumentException("K can't be negative");
        }

        if(array == null || array.length<2){
            return;
        }

        int n= array.length;

        if(k>n){
            k= k %n;
        }

        reverseArray(array,0,k-1);
        reverseArray(array, k, n-1);
        reverseArray(array, 0, n-1);

    }

    private void reverseArray(int[] array, int i, int j) {
        while(i<j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            i++;
            j--;
        }

    }

}

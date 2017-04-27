

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class NoofZerosFrom1ToN {

    public static void main(String[] args) {
        int[] array = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1};
        int x = findZero(array, 0, array.length);

        System.out.println(array.length - x);
    }

    private static int findZero(int[] array, int low, int high) {

        int mid = 0;
        while(low<high){
            mid = low+(high-low)/2;
            if(array[mid]==0 && array[mid+1]==1){
                return mid;
            }else if(array[mid]==1 && array[mid-1]==0){
                return mid;
            }else if(array[mid]==0 && array[mid+1]==0){
                low = mid+1;
            }else if(array[mid]==1 && array[mid-1]==1){
                high = mid-1;
            }



        }

        return low;
    }

}

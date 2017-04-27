/**
 *
 */

/**
 * @author sparid2
 *
 */
public class Solution2 {

    private static int[][] Array= {

            {1,3,6,7},
            {9,12,34,89},
            {90, 93,98,99}
    };

    private static boolean isFound(int[][] matrix, int data){

        int lengthOfRow = matrix.length;
        int lengthOfColumn = matrix[0].length;
        int start = 0;
        int end = lengthOfRow * lengthOfColumn -1;

        while (start<=end) {

            int mid = (start+end)/2;
            int midX = mid/lengthOfColumn;
            int midY = mid%lengthOfColumn;

            if(matrix[midX][midY] == data){
                return true;
            }

            if(matrix[midX][midY] < data){
                start = start+1;
            }else{
                end = end-1;
            }

        }

        return false;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        boolean found = isFound(Array, 6);
        System.out.println(found);

    }

}

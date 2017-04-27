/**
 *
 */

/**
 * @author sparid2
 *
 */
public class MiddleIndexOfAnArray {

    static int[] num = { 2, 4, 4, 5, 4, 1 };



    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        int index = findTheMiddleIndex(num);
        System.out.println(index);

    }

    private static int findTheMiddleIndex(int[] num2) throws Exception {
        int start = 0;
        int end = num2.length-1;
        int leftSum = 0;
        int rightSum = 0;
        while(true){
            if(leftSum < rightSum){
                leftSum+=num2[start++];
            }else{
                rightSum+=num2[end--];
            }
            if (start > end) {
                if (leftSum == rightSum) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }

        }
        return end;
    }

}

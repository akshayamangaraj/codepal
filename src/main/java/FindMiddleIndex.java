import java.util.Arrays;
import java.util.List;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class FindMiddleIndex {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        int[] num = { 2, 4, 4, 5, 4, 1 };
        List list = Arrays.asList(num);
        int middleIndex = findTheMiddleIndex(num);
        System.out.println(middleIndex);

    }

    private static int findTheMiddleIndex(int[] num) throws Exception {
        int startIndex = 0;
        int endIndex = num.length-1;
        int leftSum = 0;
        int rightSum = 0;
        while(true){
            if(leftSum > rightSum){
                rightSum+=num[endIndex--];
            }else{
                leftSum+=num[startIndex++];

            }
            if (startIndex > endIndex) {
                if (leftSum == rightSum) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }

        }

        return endIndex;

    }

}

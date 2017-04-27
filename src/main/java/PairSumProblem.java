import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author SubratParida
 *
 */
public class PairSumProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = new  int[]{1,3,5,7,9,11};
		int[] result = findPairSum(array,20);
		//System.out.println(array[result[0]]+array[result[1]]);
		System.out.println("The desired numbers are:"+array[result[0]]+" and "+array[result[1]]);
	}

	private static int[] findPairSum(int[] array, int i) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int j = 0; j < array.length; j++) {
			if(map.containsKey(array[j])){
				int index = map.get(array[j]);
				result[0] = index;
				result[1] = j;
			}else{
				map.put(i-array[j], j);
			}
			
		}
		return result;
		
	}

} 

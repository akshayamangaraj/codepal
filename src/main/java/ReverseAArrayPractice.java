/**
 *
 */

/**
 * @author sparid2
 *
 */
public class ReverseAArrayPractice {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = new int[]{2,4,1,5,6};
        printArray(array);
        reverseAArray(array);
        printArray(array);

    }

    private static void reverseAArray(int[] array) {
        reverseArray(array,0,array.length-1);

    }

    private static void reverseArray(int[] array, int i, int length) {

        if(i>=length){
            return;
        }
        int temp = array[i];
        array[i] = array[length];
        array[length] = temp;
        reverseArray(array, i+1, length-1);

    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
            System.out.println("");
        }

    }

}

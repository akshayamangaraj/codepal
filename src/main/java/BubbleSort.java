/**
 *
 */

/**
 * @author sparid2
 *
 */
public class BubbleSort {

    private static void bubbleSort(int[] a){

        int length = a.length;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i; j++) {
                if(a[j-1] > a[j]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }

            }

        }
        for (int i : a) {
            System.out.println(i);
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = new int[]{9,8,7,6,5,2,0};
        bubbleSort.bubbleSort(array);

    }

}

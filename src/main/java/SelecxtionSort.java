import java.util.Arrays;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class SelecxtionSort {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {8,2,7,11,0,5};
        System.out.println("Arrays before sorting :"+Arrays.toString(array));
        int[] a = SelecxtionSort.sort(array);
        System.out.println("Arrays after sorting is :"+Arrays.toString(array));

    }

    private static int[] sort(int[] a){

        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[min]){
                    swap(a,j,min);
                }

            }

        }

        return a;

    }

    private static void swap(int[] a, int j, int min) {
        int temp = a[j];
        a[j]=a[min];
        a[min]=temp;

    }

}

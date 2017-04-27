import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] inputArray = { 7, 2, 6, 4, 9, 11, 19, 13,0 };
        System.out.println("Before sorting " + Arrays.toString(inputArray));
        selectionSort(inputArray);
        System.out.println("After sorting " + Arrays.toString(inputArray));

    }

    public static void selectionSort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[iMin]) {
                    swap(arr, j, iMin);
                }
            }
        }
    }

    public static void swap(int[] arr, int j, int iMin) {
        int temp = arr[j];
        arr[j] = arr[iMin];
        arr[iMin] = temp;
    }

}

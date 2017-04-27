/**
 *
 */

/**
 * @author sparid2
 *
 */
public class SelectionSortPractice {

    private static void sorting(int[] a){
        int length = a.length;
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[min]){
                    swap(a,j,min);
                }

            }

        }
        for (int i : a) {
            System.out.println(i);
        }
    }



    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;

    }



    /**
     * @param args
     */
    public static void main(String[] args) {
        SelectionSortPractice selectionSortPractice = new SelectionSortPractice();
        int[] a = {8,2,1,7,3,0,5};
        selectionSortPractice.sorting(a);


    }

}

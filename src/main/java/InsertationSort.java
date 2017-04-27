/**
 *
 */

/**
 * @author sparid2
 *
 */
public class InsertationSort {

    private static void sort(int[] a){

        for (int i = 1; i < a.length; i++) {
            for (int j = i; j>0; j--) {
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }

            }

        }
        for (int i : a) {

            System.out.println(i);
            //System.out.print(",");
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        InsertationSort sort = new InsertationSort();
        int[] a= {9,0,7,3,8,0,1};
        sort.sort(a);

    }

}

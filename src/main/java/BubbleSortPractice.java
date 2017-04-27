
public class BubbleSortPractice {

    private static void  sort(int[] a){

        int length = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i; j++) {
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }

        }
        for (int i : a) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        BubbleSortPractice sort = new BubbleSortPractice();
        int[] a = new int[]{9,8,3,6,0,1};
        sort.sort(a);
    }

}

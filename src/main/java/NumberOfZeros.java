import java.util.Scanner;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class NumberOfZeros {

    private static final Character ZERO = '0';

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a no");
        int no = sc.nextInt();
        for (int i = 1; i <=no; i++) {
            String s= Integer.toString(i);
            if(s.contains("0")){
                counter++;
            }

                }





        System.out.println(counter);

    }

}

import java.util.Scanner;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class TailRecursion {

    private static int factorial(int no, int result){

        if(no == 0)
            return result;
        //result = result+factorial(no-1, result);
        return factorial(no-1, no*result);

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no :");
        int no = sc.nextInt();
        int fact = factorial(no,1);
        System.out.println(fact);

    }

}

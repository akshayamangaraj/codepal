import java.util.Scanner;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class FactorialUsingRecursion {

    private static int factorial(int no) {

        int fact = 0;

        if (no == 1)
            return 1;

        fact = fact + no * factorial(no - 1);

        return fact;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no whose factorial needs to be calculated :");
        int no = scanner.nextInt();
        int fact = factorial(no);
        System.out.println(fact);

    }

}

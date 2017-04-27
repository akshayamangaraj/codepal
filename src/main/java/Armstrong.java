import java.util.Scanner;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class Armstrong {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no");
        int number1 = scanner.nextInt();
        int number = number1;
        int length = String.valueOf(number).length();
        int sum = 0;
        while(number>0){
            int no = number%10;
            sum = (int) (sum+Math.pow(no, length));
            number = number/10;

        }

        if(sum == number1){
            System.out.println("is a armstrong");
        }else{
            System.out.println("not a armstrong");
        }

    }

}

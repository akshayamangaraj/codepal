import java.util.Scanner;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class ConvertDecimalToBinary {

    static int[] binary = new int[16];
    /**
     * @param args
     */
    public static void main(String[] args) {
        convertDecimalToBinary(new Scanner(System.in).nextInt());

    }

    private static void convertDecimalToBinary(int number) {
        int array = 0;
        while(number>0){
            binary[array++]=number%2;
            number = number/2;
        }

        for (int i = binary.length-1; i>=0;i--) {
            System.out.print(binary[i]);

        }

    }

}

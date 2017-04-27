import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorFunc {

    private static final int TWO = 2;
    Scanner scanner = new Scanner(System.in);
    boolean run = true;
    float fnum = 0;
    float snum = 0;
    float answer = 0;
    float result = 0;

    public void calcResult(float num1, float num2, int opr) {

        switch (opr) {
        case 1:

            float result1 = num1 + num2;
            BigDecimal bd = new BigDecimal(Float.toString(result1));
            bd = bd.setScale(TWO, BigDecimal.ROUND_HALF_UP);
            System.out.println("Result of addition is " + bd.floatValue());
            break;
        case 2:
            float result2 = num1 - num2;
            BigDecimal bd1 = new BigDecimal(Float.toString(result2));
            bd = bd1.setScale(TWO, BigDecimal.ROUND_HALF_UP);
            System.out.println("Result of substraction is " + bd1.floatValue());
            break;
        case 3:
            float result3 = num1 * num2;
            BigDecimal bd2 = new BigDecimal(Float.toString(result3));
            bd = bd2.setScale(TWO, BigDecimal.ROUND_HALF_UP);
            System.out.println("Result of multiplication is " + bd2.floatValue());
            break;
        case 4:
            if (num2 != 0) {
                float result4 = num1 / num2;
                BigDecimal bd3 = new BigDecimal(Float.toString(result4));
                bd = bd3.setScale(TWO, BigDecimal.ROUND_HALF_UP);
                System.out.println("Result of substraction is " + bd3.floatValue());
            } else
                System.out.println("Invalid input - cannot divide by 0.");
            break;

        }
    }

}

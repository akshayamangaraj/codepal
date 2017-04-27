import java.util.concurrent.Callable;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class MyCallable implements Callable<Long>{



    @Override
    public Long call() throws Exception {
        long sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum +=i;

        }
        return  sum;
    }

}

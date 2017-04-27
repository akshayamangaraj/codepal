import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class CallableFeature {

    private static final int nTread = 10;

    /**
     * @param args
     */
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(nTread);
        List<Future<Long>> list = new ArrayList<>();
        for (int i = 0; i < 20000; i++) {
            Callable<Long> worker = new MyCallable();
            Future<Long> submit = executor.submit(worker);
            list.add(submit);
        }

        System.out.println("size is:"+list.size());
        long sum = 0;

        for (Future<Long> future : list) {
            try {
                sum +=future.get();
            } catch (InterruptedException | ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("sum is:"+sum);
        executor.shutdown();
        /*try {
            //executor.awaitTermination(100000, TimeUnit.MILLISECONDS);
            executor.awaitTermination(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/



    }

}

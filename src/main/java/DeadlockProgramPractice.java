/**
 *
 */

/**
 * @author sparid2
 *
 */
public class DeadlockProgramPractice {

    String str1 = "subrat";
    String str2 = "parida";

    Thread t1 = new Thread("Thread-1"){
        public void run(){
            while(true){
                synchronized (str1) {
                    synchronized (str2) {
                    System.out.println(str1+str2);
                    }

                }
            }
        }
    };

    Thread t2 = new Thread("Thread-2"){
        public void run(){
            while(true){
                synchronized (str2) {
                    synchronized (str1) {
                    System.out.println(str1+str2);
                    }

                }
            }
        }
    };

    /**
     * @param args
     */
    public static void main(String[] args) {

        DeadlockProgramPractice obj = new DeadlockProgramPractice();
        obj.t1.start();
        obj.t2.start();
    }

}

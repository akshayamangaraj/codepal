/**
 *
 */

/**
 * @author sparid2
 *
 */
public class DeadlockProgram {

    String s1 = "java";
    String s2 = "Unix";

    Thread thread1 = new Thread("Thread1"){
        public void run(){
            while(true){
                synchronized (s1) {
                    synchronized (s2) {
                        System.out.println(s1+s2);

                    }
                }
            }
        }
    };


    Thread thread2 = new Thread("Thread1"){
        public void run(){
            while(true){
                synchronized (s2) {
                    synchronized (s1) {
                        System.out.println(s1+s2);

                    }
                }
            }
        }
    };



    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DeadlockProgram obj = new DeadlockProgram();
        obj.thread1.start();
        obj.thread2.start();

    }

}

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class SingletonClass {

    private static SingletonClass instance = null;

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        if(instance == null){
            synchronized (instance) {
                instance = new SingletonClass();
            }
        }
        return instance;
    }

}

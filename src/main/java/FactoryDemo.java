/**
 *
 */

/**
 * @author sparid2
 *
 */
public class FactoryDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Animal obj = AnimalFactory.getSpeak("dog");
        obj.speak();
        Animal obj1 = AnimalFactory.getSpeak("cat");
        obj1.speak();
        Animal obj2 = AnimalFactory.getSpeak("cow");
        obj2.speak();

    }

}

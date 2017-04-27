/**
 *
 */

/**
 * @author sparid2
 *
 */
public class AnimalFactory {

    public static Animal getSpeak(String type){
        if(type.equals("dog")){
            return new Dog();
        }else if (type.equals("cat")) {

            return new Cat();
        }else if(type.equals("cow")){
            return new Cow();
        }


        return null;

    }

}

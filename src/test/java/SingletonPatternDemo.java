import com.shakti.coding.assignment.SingletonPattern;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class SingletonPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingletonPattern instance = SingletonPattern.getInstance();
		SingletonPattern anotherInstance = SingletonPattern.getInstance();
		System.out.println(instance);
		System.out.println(anotherInstance);

	}

}

import java.util.Stack;
/**
 *
 */

/**
 * @author sparid2
 *
 */
public class ReverseAStack {

    public static void revertStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        } else {
            Integer a = s.pop();
            revertStack(s);
            appendStack(s, a);
        }
    }

    public static void appendStack(Stack<Integer> s, Integer a) {
        if (s.isEmpty()) {
            s.push(a);
            return;
        } else {
            Integer o = s.pop();
            appendStack(s, a);
            s.push(o);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
       java.util.Stack<Integer> object = new java.util.Stack<>();
       object.push(1);
       object.push(2);
       object.push(3);
       object.push(4);
       object.push(5);
       revertStack(object);
    }

}

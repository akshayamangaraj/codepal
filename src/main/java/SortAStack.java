import java.util.Stack;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class SortAStack {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(71);
        stack.push(17);
        stack.push(70);
        stack.push(77);
        Stack<Integer> value =sortStack(stack);

    }

    private static Stack<Integer> sortStack(Stack<Integer> stack) {

        Stack<Integer> temp = new Stack<>();
        int data = stack.pop();
        while(!stack.isEmpty()){
            while(!temp.isEmpty() && temp.peek()>data){
                stack.push(temp.pop());
            }
            temp.push(stack.pop());
        }


        return temp;


    }

}

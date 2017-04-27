import java.util.Stack;
/**
 *
 */

/**
 * @author sparid2
 *
 */
public class SortAStackUsingTemporaryStack {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new java.util.Stack<>();
        stack.push(11);
        stack.push(1);
        stack.push(6);
        stack.push(8);
        stack.push(3);
        stack.push(7);
        sort(stack);

    }

    private static void sort(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        int temp = 0;
        while(!stack.isEmpty()){
            temp = stack.pop();
            while(!tempStack.isEmpty()&& tempStack.peek()>temp){
                stack.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        System.out.println(tempStack);

    }

}

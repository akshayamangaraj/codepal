/**
 *
 */

/**
 * @author sparid2
 *
 */
public class Stack {

    private static int[] stack = new int[100];
    private static int top = -1;


    private static void push(int item) throws Exception{

        if(top==stack.length-1){
            throw new Exception("stack is full");
        }
        else {
            stack[++top] = item;
        }

    }

    private int pop() throws Exception{
        if(top==-1){
            throw new Exception("stack is empty");
        }else{
            return stack[top--];
        }

    }

    private int peek() throws Exception{
        if(top==-1){
            throw new Exception("stack is empty");
        }
        return stack[top];
    }

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(5);

    }

}

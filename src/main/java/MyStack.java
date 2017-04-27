import java.util.Arrays;

/**
 *
 */

/**
 * @author sparid2
 *
 */
public class MyStack {


    private static Long[] myArray;
    private int size;
    private static int top;



    public MyStack(int size) {
        this.size = size;
        myArray = new Long[size];
        top = -1;

    }

    private void push(long data){
        myArray[++top]=data;
    }

    private long pop(){

        return myArray[top--];

    }

    private long peek(){
        return myArray[top];

    }

    private boolean isEmpty(){
        return top==-1;
    }

    private boolean isFull(){
        return top==myArray[size-1];
    }
    /**
     * @param args
     */
    public static void main(String[] args) {

        MyStack obj = new MyStack(8);
        obj.push(9);
        obj.push(99);
        obj.push(19);
        obj.push(91);
        obj.push(8);
        obj.push(6);
        System.out.println("data in the stack are :"+ Arrays.deepToString(myArray));
        while(!obj.isEmpty()){
        System.out.println(obj.pop());
        }
        System.out.println("top value is :"+top);
        System.out.println("data in the stack are :"+ Arrays.deepToString(myArray));
        System.out.println(obj.peek());
        System.out.println("Is stack empty :"+obj.isEmpty());
        System.out.println("Is stack Full :"+obj.isFull());

    }

}

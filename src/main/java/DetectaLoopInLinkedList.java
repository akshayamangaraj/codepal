/**
 *
 */

/**
 * @author sparid2
 *
 */
public class DetectaLoopInLinkedList {


    private Node head;



    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        DetectaLoopInLinkedList object = new DetectaLoopInLinkedList();
        object.push(20);
        object.push(11);
        object.push(22);
        object.head.next.next.next = object.head;
        object.detectLoop();


    }

    private void detectLoop() {
        Node slow_P = head;
        Node fast_p = head;
        while(slow_P!=null && fast_p!=null ){
            slow_P = slow_P.next;
            fast_p = fast_p.next.next;
            if(slow_P == fast_p){
                System.out.println("Loop found");
            }else{
            System.out.println("there is no loop!!");
            }
        }

    }

    private void push(int i) {
        Node node = new Node(i);
        node.setNext(this.head);
        this.head = node;

    }

    private static class Node{
        private int data;
        private Node next;

        public Node (int data){
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node [data=" + data + ", next=" + next + "]";
        }

    }

}

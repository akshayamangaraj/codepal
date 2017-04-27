/**
 *
 */

/**
 * @author sparid2
 *
 */
public class RemoveDuplicatesFromLinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "RemoveDuplicatesFromLinkedList [head=" + head + "]";
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        Node list = prepareLinkedList(new int[] { 1, 2, 2, 3, 3, 4 });
        System.out.println(list);
        Node list1 = removeDuplicates(list);
        System.out.println("After removing duplicates in LinkedList, the values are :"+list1);

    }

    private static Node removeDuplicates(Node list) {
        if(list==null){
            return null;
        }
        Node temp = list;
        while(temp.next!=null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return list;
    }

    private static Node prepareLinkedList(int... num) {

        Node head = new Node(num[0]);
        Node temp = head;
        for (int i = 1; i < num.length; i++) {
            Node newNode = new Node(num[i]);
            temp.setNext(newNode);
            temp = newNode;
        }

        return head;
    }

    private static class Node {
        private int data;
        private Node next;

        Node(int data) {
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

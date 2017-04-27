/**
 *
 */

/**
 * @author sparid2
 *
 */
public class RemoveDuplicatesFromLinkedListPractice {

    private Node head;

    /**
     * @param args
     */
    public static void main(String[] args) {

        RemoveDuplicatesFromLinkedListPractice object = new RemoveDuplicatesFromLinkedListPractice();
        Node list = object.prepareLinkedList(new int[] { 2, 3, 4, 4, 5, 6, 6, 7, 8, 8 });
        System.out.println(list);
        Node data = removeDuplicates(list);
        System.out.println(data);

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

    private Node prepareLinkedList(int[] is) {
        if (is == null) {
            return null;
        }
        Node head = new Node(is[0]);
        Node temp = head;
        for (int i = 1; i < is.length; i++) {

            Node newNode = new Node(is[i]);
            temp.setNext(newNode);

            temp = newNode;
        }
        return head;
    }

    private static class Node {

        private Integer data;
        private Node next;

        Node(Integer data) {
            this.data = data;

        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
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

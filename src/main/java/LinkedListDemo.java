/**
 *
 */

/**
 * @author sparid2
 *
 */
public class LinkedListDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedList list = new LinkedList();
        list.insertAtHead(2);
        list.insertAtHead(20);
        list.insertAtHead(2);
        list.insertAtHead(12);
        list.insertAtHead(21);

        list.deleteFromHead();

        System.out.println(list);
        System.out.println("length is :"+list.length());
        System.out.println("Found :"+list.find(20));

    }

}

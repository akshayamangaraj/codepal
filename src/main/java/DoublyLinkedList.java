/**
 *
 */

/**
 * @author sparid2
 *
 */
public class DoublyLinkedList {

    private DoubleyLinkedNode head;

    public void insertatHead(int data){
        DoubleyLinkedNode newNode = new DoubleyLinkedNode(data);
        newNode.setNextNode(this.head);
        if(this.head !=null){
            this.head.setNextNode(newNode);
        }

        this.head = newNode;

    }

    public int length(){
        DoubleyLinkedNode current = this.head;
        int length = 0;
        if(this.head == null){
            return 0;
        }
        while(current!=null){
            length++;
            current = current.getNextNode();
        }

        return length;

    }

}

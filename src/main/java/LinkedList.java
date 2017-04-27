/**
 *
 */

/**
 * @author sparid2
 *
 */
public class LinkedList {

    private Node head;

    public void insertAtHead(int data){

        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    @Override
    public String toString() {
        return "LinkedList [head=" + head + "]";
    }

    public int length(){

        Node currentNode = this.head;
        int length = 0;
        while(currentNode!=null){
            length++;
            currentNode = currentNode.getNextNode();
        }

        return length;
    }

    public void deleteFromHead(){
        this.head = this.head.getNextNode();
    }

    public Node find(int data){
        Node currentNode = this.head;
        while(currentNode !=null){
            if(currentNode.getData() == data){
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }
        return null;
    }

}

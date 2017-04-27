/**
 *
 */

/**
 * @author sparid2
 *
 */
public class DoubleyLinkedNode {

    private int data;
    private DoubleyLinkedNode nextNode;
    private DoubleyLinkedNode previousNode;

    public DoubleyLinkedNode(int size){
        this.data = size;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public DoubleyLinkedNode getNextNode() {
        return nextNode;
    }
    public void setNextNode(DoubleyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }
    public DoubleyLinkedNode getPreviousNode() {
        return previousNode;
    }
    public void setPreviousNode(DoubleyLinkedNode previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "DoubleyLinkedNode [data=" + data + ", nextNode=" + nextNode + ", previousNode=" + previousNode + "]";
    }



}

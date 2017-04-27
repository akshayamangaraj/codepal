/**
 *
 */
package com.linkedlist.practice;

/**
 * @author sparid2
 *
 */
public class LinkedList<Integer> {

    private Node head;



    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public int length(){
        Node currentNode = this.head;
        int length =0;
        while(currentNode!=null){
            length++;
            currentNode = currentNode.getNextNode();
        }
        return length;

    }

    public void delete(){
        this.head = this.head.getNextNode();
    }

    public Node find(int data){
        Node currentNode = this.head;

        while(currentNode!=null){
            if(currentNode.getData()==data){
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }

        return null;

    }

 // Reverse linkedlist using this function
    public static Node reverseLinkedList(Node currentNode)
     {
    // For first node, previousNode will be null
    Node previousNode=null;
      Node nextNode;
      while(currentNode!=null)
      {
       nextNode=currentNode.getNextNode();
      // reversing the link
      // currentNode.getNextNode()=previousNode;
      // moving currentNode and previousNode by 1 node
       previousNode=currentNode;
       currentNode=nextNode;
      }
      return previousNode;
     }



    /*@Override
    public String toString() {
        return "LinkedList [head=" + head + "]";
    }*/

    @Override
    public String toString() {
        String res = "";
        Node<Integer> curr = this.head;
        while (curr != null) {
            res += curr + ", ";
            curr = curr.getNextNode();
        }
        return res;
    }



}

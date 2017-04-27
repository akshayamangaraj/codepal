/**
 *
 */
package com.linkedlist1;

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

    public int length(){

        int length = 0;
        Node currentNode = this.head;
        while(currentNode!=null){
            length++;
            currentNode = currentNode.getNextNode();
        }

        return length;

    }

    public void deleteAtHead(){
        this.head = this.head.getNextNode();
    }

    public Node find(int data){

        Node currentNode = this.head;

        while(currentNode!=null){
            if(currentNode.getData()== data){
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }

        return null;

    }

    @Override
    public String toString() {
        String res = "";
        Node curr = this.head;
        while (curr != null) {
            res += curr + ", ";
            curr = curr.getNextNode();
        }
        return res;
    }



}

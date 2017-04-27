/**
 *
 */
package com.linkedlist;

/**
 * @author sparid2
 *
 */
public class LinkedList {

    private Node head;

    public void insert(int data){


        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;

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

    public void deleteNodeAtHead(){
        this.head = this.head.getNextNode();
    }

    public Node find (int data){
        Node headNode = this.head;
        while(headNode!=null){
            if(headNode.getData() == data){
                return headNode;

            }
            headNode = headNode.getNextNode();
        }
        return null;
    }

    @Override
    public String toString() {
        return "LinkedList [head=" + head + "]";
    }



}

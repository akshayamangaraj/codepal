/**
 *
 */
package com.subrat.finallinkedlist;

/**
 * @author sparid2
 *
 */
public class LinkedList {

    private Node head;

    public void insert(int data){
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void delete(){

        this.head = this.head.getNext();

    }

    public Node find(int data){
        Node currentNode = this.head;
        while(currentNode !=null){
            if(currentNode.getData() == data){
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public int size(){

        Node CurrentNode = this.head;
        int counter = 0;
        while(CurrentNode !=null){
            counter++;
            CurrentNode = CurrentNode.getNext();
        }
        return counter;
    }

}

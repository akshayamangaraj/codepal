/**
 *
 */
package com.subrat.linkedlistpackage;

/**
 * @author sparid2
 *
 */
public class LinkedList {

    private Node head;

    public void insertInHead(int data){

        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;

    }

    public void deleteFromHead(){

        this.head = this.head.getNext();

    }

    public Node find(int data){
        Node currentNode = this.head;
        while(currentNode!=null){
            if(currentNode.getData()==data){
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public int size(){
        int counter = 0;
        Node currentNode = this.head;
        while(currentNode!=null){
            counter++;
            currentNode = currentNode.getNext();
        }
        return counter;
    }



}

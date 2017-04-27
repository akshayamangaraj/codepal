/**
 *
 */
package com.subrat.linkedlist.again;

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

        Node currentNode = this.head;
        int length= 0;
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
            if(currentNode.getData()==data){
                return currentNode;
            }
            currentNode = currentNode.getNextNode();
        }

        return null;

    }

    public String toString(){
        String result = "{";
        Node currentNode = this.head;
        while(currentNode!=null){
            result+=currentNode.toString()+",";
            currentNode = currentNode.getNextNode();
        }
        result+="}";
        return result;
    }

}

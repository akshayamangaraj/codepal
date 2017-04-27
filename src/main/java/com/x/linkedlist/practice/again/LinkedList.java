/**
 *
 */
package com.subrat.linkedlist.practice.again;

/**
 * @author sparid2
 *
 */
public class LinkedList {

    private Node head;

    public void insertAtHead(int data){
        Node node = new Node(data);
        node.setNextNode(this.head);
        this.head = node;
    }

    public void deleteAtHead(){
        this.head = this.head.getNextNode();
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
        while(currentNode !=null){
            result+=currentNode.toString()+",";
            currentNode = currentNode.getNextNode();
        }
        result +="}";

        return result;

    }

    public boolean hasCycle(LinkedList list){
        Node fast = this.head;
        Node slow = this.head;

        while(fast!=null && fast.getNextNode()!=null){
            slow = slow.getNextNode();
            fast = fast.getNextNode().getNextNode();

            if(slow == fast){
                return true;
            }
        }


        return false;

    }

}

/**
 *
 */
package com.subrat.linkedlist.again;

/**
 * @author sparid2
 *
 */
public class Node {

    private int data;
    private Node nextNode;

    public Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Data: "+this.data;
    }



}

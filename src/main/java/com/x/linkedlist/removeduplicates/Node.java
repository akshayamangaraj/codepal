/**
 *
 */
package com.subrat.linkedlist.removeduplicates;

/**
 * @author sparid2
 *
 */
public class Node {

     int data;
     Node next;

    public Node (int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }



}

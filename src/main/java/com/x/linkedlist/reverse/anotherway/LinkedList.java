/**
 *
 */
package com.subrat.linkedlist.reverse.anotherway;

/**
 * @author sparid2
 *
 */
public class LinkedList {

    private Node head;

    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList object = new LinkedList();
        Node list = object.prepareLinkedList(1,2,3,4,5,6);
        System.out.println(list);
       // object.reverse();
        object.reverse(list);
        object.printlist();
        //System.out.println(list);


    }

    private  void printlist() {
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
        System.out.println("null");

    }

    private void reverse() {
        reverse(head);

    }

    private void reverse(Node list) {
        if(list==null){
            return;
        }

        if(list.getNext()==null){
            this.head = list;
            return;
        }
        reverse(list.getNext());
        list.getNext().setNext(list);
        list.setNext(null);

    }

    private static Node prepareLinkedList(int... node) {
        Node head = new Node(node[0]);
        Node preNode = head;
        for (int i = 1; i < node.length; i++) {
            Node newNode = new Node(node[i]);
            preNode.setNext(newNode);
            preNode = newNode;
        }
        return head;
    }

}

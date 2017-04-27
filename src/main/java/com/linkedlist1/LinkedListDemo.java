/**
 *
 */
package com.linkedlist1;

/**
 * @author sparid2
 *
 */
public class LinkedListDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        LinkedList list = new LinkedList();
        list.insertAtHead(2);
        list.insertAtHead(4);
        list.insertAtHead(29);
        list.insertAtHead(7);
        list.insertAtHead(12);
        list.insertAtHead(20);

        System.out.println(list);
        System.out.println(list.length());
        System.out.println(list.find(7));
        list.deleteAtHead();
        System.out.println(list.length());

    }

}

/**
 *
 */
package com.linkedlist.practice;

/**
 * @author sparid2
 *
 */
public class LinkedListDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtHead(2);
        list.insertAtHead(23);
        list.insertAtHead(52);
        list.insertAtHead(42);
        list.insertAtHead(22);
        list.insertAtHead(12);
        list.insertAtHead(20);

        System.out.println(list);
        System.out.println(list.length());
        list.delete();
        System.out.println(list.length());
        System.out.println("found :"+list.find(22));

    }

}

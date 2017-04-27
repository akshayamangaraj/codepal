/**
 *
 */
package com.subrat.linkedlist.again;

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
        list.insertAtHead(5);
        list.insertAtHead(50);
        list.insertAtHead(15);
        list.insertAtHead(53);
        list.insertAtHead(55);
        list.insertAtHead(66);

        list.deleteAtHead();

        System.out.println(list);
        System.out.println("length is:"+list.length());
        System.out.println("Found :"+list.find(55));
    }

}

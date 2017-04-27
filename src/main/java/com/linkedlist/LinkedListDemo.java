/**
 *
 */
package com.linkedlist;

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
        list.insert(8);
        list.insert(6);
        list.insert(18);
        list.insert(82);
        list.insert(12);

        System.out.println(list);
        System.out.println(list.length());
        System.out.println("found"+list.find(82));

    }

}

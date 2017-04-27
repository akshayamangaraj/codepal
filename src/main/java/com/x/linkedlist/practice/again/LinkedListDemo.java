/**
 *
 */
package com.subrat.linkedlist.practice.again;

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
        list.insertAtHead(12);
        list.insertAtHead(1);
        list.insertAtHead(129);
        list.insertAtHead(123);
        list.insertAtHead(20);
        list.insertAtHead(2);
        list.insertAtHead(22);

        System.out.println(list);
        list.deleteAtHead();
        System.out.println(list);
        System.out.println("Length is :"+list.length());
        System.out.println("Found :"+list.find(1291));

        System.out.println(list.hasCycle(list));

        LinkedList list1 = new LinkedList();
        list1.insertAtHead(3);
        list1.insertAtHead(1);

        LinkedList list2 = new LinkedList();
        list2.insertAtHead(2);
        list2.insertAtHead(4);


        Node list3 = new Node(56);
        Node list4 = new Node(100);

        MergeTwoLinkedList obj = new MergeTwoLinkedList();

        //System.out.println("Merging:"+obj.MergeLists(list3, list4));

    }

}

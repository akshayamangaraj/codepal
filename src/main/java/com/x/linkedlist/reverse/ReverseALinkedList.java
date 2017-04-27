/**
 *
 */
package com.subrat.linkedlist.reverse;

/**
 * @author sparid2
 *
 */
public class ReverseALinkedList {

    /**
     * @param args
     */
    public static void main(String[] args) {
        LinkedList list = new LinkedList(5);
        list.next = new LinkedList(4);
        list.next.next = new LinkedList(3);
        list.next.next.next = new LinkedList(2);
        list.next.next.next.next = new LinkedList(1);
        System.out.println("Original LinkedList is :"+list.toString());
        list = reverseLinkedList(list);
        System.out.println(list);

    }

    private static LinkedList reverseLinkedList(LinkedList list) {
        if(list==null && list.next == null){
            return list;
        }

        LinkedList pre, next, current;
        pre = null;
        next = null;
        current = list;

        while(current!=null){
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre;
    }

}

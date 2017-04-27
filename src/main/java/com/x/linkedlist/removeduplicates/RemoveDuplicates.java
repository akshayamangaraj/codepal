/**
 *
 */
package com.subrat.linkedlist.removeduplicates;

/**
 * @author sparid2
 *
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        Node L = createLinkedList();
        removeDuplicates(L);
        System.out.println(L);
    }

    /**
     * Method to remove duplicates from the linked list.
     *
     * @param L
     */
    public static void removeDuplicates(Node L) {

        if (L == null)
            return;
        // L is the Current_Node_Ptr
        // T is the Next_Node_Ptr
        Node T = null;
        while (L != null && L.next != null) {
            T = L.next;
            while (T != null && (T.data == L.data)) {
                L.next = T.next;
                T = T.next;
            }
            L = L.next;
        }
    }

    /**
     * Helper method to create a sample sorted linked list.
     *
     * @return
     */
    public static Node createLinkedList() {
        Node L5 = new Node(5, null);
        Node L4 = new Node(4, L5);
        Node L3 = new Node(3, L4);
        Node L2 = new Node(2, L3);
        Node L1 = new Node(1, L2);
        Node l1 = new Node(4, L1);
        return l1;

    }
}


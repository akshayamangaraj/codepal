/**
 *
 */
package com.subrat.linkedlist.reverse;

/**
 * @author sparid2
 *
 */
class LinkedList {
    int value;
    LinkedList next;

    public LinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {

        String data = "";
        LinkedList current = this;
        do {
            data += current.value + ",";
            current = current.next;
        } while (current != null);

        return data;
    }

}

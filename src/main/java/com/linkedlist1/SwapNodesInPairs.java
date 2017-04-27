/**
 *
 */
package com.linkedlist1;



/**
 * @author sparid2
 *
 */
public class SwapNodesInPairs {

    private Node head;


    private static class Node{
        private Integer data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public Integer getData() {
            return data;
        }

        public void setData(Integer data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node [data=" + data + ", next=" + next + "]";
        }


    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        Node node = swapNodesInPairs.prepareLinkedList(new int[]{1,2,3,4});
    }

    private Node prepareLinkedList(int... num) {
        Node head = new Node(num[0]);
        Node temp = head;
        for (int i = 1; i < num.length; i++) {

            Node newNode = new Node(num[i]);
            temp.setNext(newNode);
            temp = newNode;

        }
        return head;

    }

}

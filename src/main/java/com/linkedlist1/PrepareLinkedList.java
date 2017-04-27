/**
 *
 */
package com.linkedlist1;

/**
 * @author sparid2
 *
 */
public class PrepareLinkedList {

    private Node head;

    /**
     * @param args
     */
    public static void main(String[] args) {
        PrepareLinkedList object = new PrepareLinkedList();
        Node list1 = object.prepareList(new int[]{1,3,5,7});
        Node list2 = object.insertAtHead(new int[]{2,4,6});
        System.out.println(list1);
        System.out.println(list2);

    }

    private Node insertAtHead(int... num) {
        int i=0;
        int j = num.length;
        while(j>=i){
            Node newNode = new Node(num[j-1]);
            newNode.setNext(this.head);
            this.head = newNode;
            j--;
        }
        return head;
    }

    private Node prepareList(int... num) {
        Node head = new Node(num[0]);
        Node temp = head;
        for (int i = 1; i < num.length; i++) {
            Node newNode = new Node(num[i]);
            temp.setNext(newNode);
            temp = newNode;
        }
        return head;


    }

    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
        }
        public int getData() {
            return data;
        }
        public void setData(int data) {
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

}

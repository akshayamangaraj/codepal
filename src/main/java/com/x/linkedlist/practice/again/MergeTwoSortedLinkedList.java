/**
 *
 */
package com.subrat.linkedlist.practice.again;

/**
 * @author sparid2
 *
 */
public class MergeTwoSortedLinkedList {



    /**
     * @param args
     */
    public static void main(String[] args) {

        MergeTwoSortedLinkedList obj = new MergeTwoSortedLinkedList();
        Node list1 = obj.prepareLinkedList(new int[]{1,3,5,7,9});
        Node list2 = obj.prepareLinkedList(new int[]{2,4,6,8});
        Node list = obj.mergeTwoSortedList(list1, list2);
        obj.printLinkedList(list);


    }

    public Node prepareLinkedList(int... data){
        Node head = new Node(data[0]);
        Node previousNode = head;
        for (int i = 1; i < data.length; i++) {
            Node newNode = new Node(data[i]);
            previousNode.next = newNode;
            previousNode = newNode;
        }
        return head;

    }

    public void printLinkedList(Node node){
        while(node!=null ){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println("null");
    }

    public Node mergeTwoSortedList(Node l1, Node l2){

        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.data < l2.data){
            l1.next = mergeTwoSortedList(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoSortedList(l2.next, l1);
            return l2;
        }

    }

    static class Node{
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

/**
 *
 */
package com.subrat.linkedlist.practice.again;

/**
 * @author sparid2
 *
 */
public class MergeTwoLinkedList {

    public static void main(String[] args) {
        MergeTwoLinkedList obj = new MergeTwoLinkedList();
        Node list1 = obj.prepareLinkedList(new int[]{1,3,5,7});
        Node list2 = obj.prepareLinkedList(new int[]{2,4,6,8});
        Node node = obj.MergeListsByRecursion(list1, list2);
        obj.printLinkedList(node);
       obj.fun1(node);
        obj.fun2(node);
        obj.fun("subrat");

    }

    public void fun2(Node head){
        if(head == null)
            return;
        System.out.print(head.next.getData());

        if(head.getNext() !=null)
            fun2(head.next.next);
        System.out.print(head.data);
    }

    public void fun1(Node head){
        if(head == null){
            return;
        }
        fun1(head.getNext());
        System.out.print(head.getData());
    }

    public void fun(String str){
        if (str.length() == 1 ){
            System.out.print(str);
            return;

        }
        char c = str.charAt(0);
        fun(str.substring(1));
        System.out.print(c);

    }

    Node MergeListsByRecursion(Node list1, Node list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        if (list1.getData() < list2.getData()) {
            list1.next = MergeListsByRecursion(list1.getNext(), list2);
            return list1;

        } else {
            list2.next = MergeListsByRecursion(list2.getNext(), list1);
            return list2;
        }

    }

    public void printLinkedList(Node head){

        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node prepareLinkedList(int... data) {

        Node head = new Node(data[0]);
        Node previousNode = head;
        for (int i = 1; i < data.length; i++) {
            Node node = new Node(data[i]);
            previousNode.next = node;
            previousNode = node;
        }

        return head;

    }

    static class Node {
        private int data;
        private Node next;

        public Node(int data) {
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

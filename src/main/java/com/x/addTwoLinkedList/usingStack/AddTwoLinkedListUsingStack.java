/**
 *
 */
package com.x.addTwoLinkedList.usingStack;

import java.util.Stack;

/**
 * @author sparid2
 *
 */
public class AddTwoLinkedListUsingStack {

    private Node head;
    private Node tail;

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {

        AddTwoLinkedListUsingStack addTwoLinkedListUsingStack = new AddTwoLinkedListUsingStack();
        Node list1 = addTwoLinkedListUsingStack.prepareLinkedList(new int[]{9,9,1,7,1});
        Node list2 = addTwoLinkedListUsingStack.prepareLinkedList(new int[]{9,9,8});
        Node list = addTwoLinkedListUsingStack.add(list1,list2);
        System.out.println(list);

    }

    private Node add(Node list1, Node list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        int sum = 0;
        int carry = 0;

        while(list1!=null){
            s1.push(list1.getData());
            list1 = list1.getNext();
        }

        while(list2!=null){
            s2.push(list2.getData());
            list2 = list2.getNext();
        }

        while(!(s1.isEmpty()) && (!s2.isEmpty())){
            int value1 = s1.pop();
            int value2 = s2.pop();
            sum = (carry+value1+value2)%10;
            carry = (value1 +value2+carry)/10;
            s3.push(sum);
        }

        while(!s1.isEmpty()){
            int value1 = s1.pop();
            sum = (carry+value1)%10;
            carry = (carry+value1)/10;
            s3.push(sum);
        }

        while(!s2.isEmpty()){
            int value2 = s2.pop();
            sum = (carry+value2)%10;
            carry = (carry+value2)/10;
            s3.push(sum);
        }

        if(carry>0){
            s3.push(carry);
        }

        return createLinkedList(s3);
    }

    private Node createLinkedList(Stack<Integer> s3) {


        if(head!=null){
            head = null;
        }

        while(!s3.isEmpty()){
            createLinkedList(s3.pop());
        }

        return head;
    }

    private void createLinkedList(Integer value) {
        if(head == null){
            head = new Node(value);
            tail = head;
            return;
        }

        Node newNode = new Node(value);
        tail.setNext(newNode);
        tail=newNode;



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

    private static class Node{

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

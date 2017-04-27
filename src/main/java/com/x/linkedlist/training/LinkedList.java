/**
 *
 */
package com.subrat.linkedlist.training;

/**
 * @author sparid2
 *
 */
public class LinkedList {

	private Node head;

	public void insertAtHead(int data){
		Node newNode = new Node(data);
		newNode.setNext(this.head);
		this.head = newNode;
	}

}

package com.tejumvsr.learning.dsa.linkedlist;

public class LinkedList {
	Node head;

	public void insert(int data) {
		// 1. create a new node with data
		Node node = new Node();
		node.data = data;

		/*
		 * 2. check if this is the fist element in the list by checking head is null or
		 * not
		 */

		if (head == null) {
			head = node;
		} else {
			/*
			 * 3. if the head is not null, means list is not empty Now we have to find the
			 * last element in the list and insert new node there
			 * 
			 */

			// creating temp node
			Node n = head;

			// loop through all the nodes till you get last element with next node as null
			while (n.next != null) {
				n = n.next;
			}

			// once the node with next null is found add the new node there
			n.next = node;

		}
	}

	public void insertAtStart(int data) {
		//1. Create a new Node
		Node node = new Node();
		node.data = data;
		node.next = head;
		// make new node as head node
		head = node;
		
//		//2. check if the list is empty
//		if(head == null) {
//			// list is empty. make the node as head
//			head = node;
//		}else {
//			// make current head node as next of new node 
//			node.next = head;
//			// make new node as head node
//			head = node;
//		}
	}
	
	public void insertAt(int index, int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		// if the index is 0, call insertAtStart
		if(index == 0) {
			this.insertAtStart(data);
			return;
		}
		Node n = head;
		for (int i = 0; i < index-1; i++) {
			System.out.println( "node at index  " + (i+1) + " : " + n.data);
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
	}
	
	public void deleteAt(int index) {
		if(index == 0) {
			head = head.next;
			return;
		}
		
		Node n = head;
		Node nTemp = null;
		for (int i = 0; i < index-1; i++) {
			System.out.println( "node at index  " + (i+1) + " : " + n.data);
			n = n.next;
		}
		nTemp = n.next;
		n.next = nTemp.next;
		nTemp = null;
	}
	
	
	public void show() {
		// creating temp node
		Node node = head;
		// loop through all the nodes till you get last element with next node as null
		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

}

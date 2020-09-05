package com.ds.linkedList;

public class LinkedListImpl<T> {

	public LinkedListNode head;

	public LinkedListImpl() {
		head = null;
	}

	public void add(Object value) {
		LinkedListNode newNode = new LinkedListNode(value, null);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void delete() {
		head = head.next;
	}

	public void display() {
		LinkedListNode n = head;
		while (n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}

}

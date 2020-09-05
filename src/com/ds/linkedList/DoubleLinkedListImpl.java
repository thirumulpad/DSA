package com.ds.linkedList;

public class DoubleLinkedListImpl<T> {

	DoubleLinkedListNode head;

	public DoubleLinkedListImpl() {
		head = null;
	}

	public void add(Object value) {
		DoubleLinkedListNode newNode = new DoubleLinkedListNode(null, null, value);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.previous = newNode;
			head = newNode;
		}
	}

	public void delete() {
		head = head.next;
		head.previous = null;
	}

	public void display() {
		DoubleLinkedListNode n = head;
		while (n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}

}

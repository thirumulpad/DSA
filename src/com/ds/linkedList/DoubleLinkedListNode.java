package com.ds.linkedList;

public class DoubleLinkedListNode {

	DoubleLinkedListNode previous;
	DoubleLinkedListNode next;
	Object value;

	public DoubleLinkedListNode(DoubleLinkedListNode previous, DoubleLinkedListNode next, Object value) {
		this.previous = previous;
		this.next = next;
		this.value = value;
	}

}

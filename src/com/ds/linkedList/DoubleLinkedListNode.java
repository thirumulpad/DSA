package com.ds.linkedList;

public class DoubleLinkedListNode {

	public DoubleLinkedListNode previous;
	public DoubleLinkedListNode next;
	public Object value;

	public DoubleLinkedListNode(DoubleLinkedListNode previous, DoubleLinkedListNode next, Object value) {
		this.previous = previous;
		this.next = next;
		this.value = value;
	}

}

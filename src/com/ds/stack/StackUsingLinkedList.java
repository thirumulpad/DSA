package com.ds.stack;

import com.ds.linkedList.LinkedListNode;

public class StackUsingLinkedList<T> {

	LinkedListNode top;

	public StackUsingLinkedList() {
		top = null;
	}

	public void push(Object value) {
		LinkedListNode newNode = new LinkedListNode(value, null);
		if (top == null) {
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}

	public T pop() {
		if (top == null) {
			System.out.println("stack is empty");
			return null;
		}
		T value = (T) top.value;
		top = top.next;
		return value;
	}

	public void display() {
		LinkedListNode n = top;
		while (n != null) {
			System.out.println((T) n.value);
			n = n.next;
		}
	}

}

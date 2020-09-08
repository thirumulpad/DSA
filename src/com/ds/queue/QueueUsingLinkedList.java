package com.ds.queue;

import com.ds.linkedList.DoubleLinkedListNode;

public class QueueUsingLinkedList<T> {

	public QueueUsingLinkedList() {
		this.front = null;
		this.rear = null;
	}

	DoubleLinkedListNode front;
	DoubleLinkedListNode rear;

	public void queue(Object value) {
		DoubleLinkedListNode newNode = new DoubleLinkedListNode(null, null, value);
		if (rear == null && front == null) {
			rear = newNode;
			front = newNode;
		} else {
			// next element in queue is null and previous should be current rear.
			newNode.next = null;
			newNode.previous = rear;
			// next to current rear should point to newNode. and the newNode should be new
			// rear
			rear.next = newNode;
			rear = newNode;
		}
	}

	public T dequeue() {
		if (rear == null || front == null) {
			System.out.println("queue is empty");
			return null;
		}
		T value = (T) front.value;
		// shift the pointer to next node and make previous node null
		front = front.next;
		if (front != null)
			front.previous = null;
		return value;
	}
}

package com.ds.queue;

public class QueueUsingArray<T> {

	Object[] queueArray;
	int size;
	int rear;
	int front;

	public QueueUsingArray(int size) {

		this.size = size;
		queueArray = new Object[this.size];
		front = -1;
		rear = -1;
	}

	public boolean isFull() {
		return (rear == size - 1);
	}

	public boolean isEmpty() {
		return (front == -1 || front > rear);
	}

	public void queue(Object newItem) {
		if (isFull()) {
			System.out.println("queue is full");
			return;
		}
		rear = rear + 1;
		queueArray[rear] = newItem;
		if (front == -1)
			front = front + 1;
	}

	public T dequeue() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return null;
		}
		T value = (T) queueArray[front];
		front = front + 1;
		return value;
	}
}

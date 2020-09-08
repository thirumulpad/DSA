package com.ds.queue;

import java.util.Arrays;

public class QueueUsingDArray<T> {

	Object[] queueArray;
	int size;
	int rear;
	int front;

	public QueueUsingDArray(int size) {

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
		ensureCapacity(rear + 2);
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

	private void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			queueArray = Arrays.copyOf(queueArray, newCapacity);
		}
	}

	public int getSize() {
		return queueArray.length;
	}

}

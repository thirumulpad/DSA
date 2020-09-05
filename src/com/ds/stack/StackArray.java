package com.ds.stack;

public class StackArray<T> {

	int top;
	Object[] stack;
	int size;

	public StackArray(int size) {
		this.size = size;
		stack = new Object[this.size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == size - 1;
	}

	public void push(T newItem) {
		if (isFull()) {
			System.out.println("stack is full");
			return;
		}
		top = top + 1;
		stack[top] = newItem;
	}

	public T pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return null;
		}
		T item = (T) stack[top];
		top = top - 1;
		return item;
	}
}

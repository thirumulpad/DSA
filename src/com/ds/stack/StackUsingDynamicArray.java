package com.ds.stack;

import java.util.Arrays;

public class StackUsingDynamicArray<T> {
	int top;
	Object[] stack;
	int size;

	public StackUsingDynamicArray(int size) {
		this.size = size;
		stack = new Object[this.size];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	private void ensureCapacity(int minCapacity) {
		int oldCapacity = getSize();
		if (minCapacity > oldCapacity) {
			int newCapacity = oldCapacity * 2;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			stack = Arrays.copyOf(stack, newCapacity);
		}
	}

	public int getSize() {
		return stack.length;
	}

	public void push(T newItem) {
		ensureCapacity(top + 2);
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

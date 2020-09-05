package com.problems;

import com.ds.linkedList.LinkedListImpl;
import com.ds.linkedList.LinkedListNode;

public class RemoveKthElement {

	public static void main(String[] args) {

		LinkedListImpl<String> linkedListImpl = new LinkedListImpl<String>();
		linkedListImpl.add(1);
		linkedListImpl.add(2);
		linkedListImpl.add(3);
		linkedListImpl.add(4);
		linkedListImpl.add(5);
		linkedListImpl.add(6);
		linkedListImpl.display();
		// handle the scenario with removing 6th element.
		deleteKthElement(linkedListImpl.head, 1);
		System.out.println("removed element");
		linkedListImpl.display();
	}

	private static void deleteKthElement(LinkedListNode root, int k) {

		LinkedListNode slowPtr = root;
		LinkedListNode fastPtr = root;

		// move fast pointer to slow + k
		while (k > 0) {
			fastPtr = fastPtr.next;
			k--;
		}

		while (fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}

		slowPtr.next = slowPtr.next.next;

	}
}

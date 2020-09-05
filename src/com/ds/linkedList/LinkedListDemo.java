package com.ds.linkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedListImpl<String> linkedList = new LinkedListImpl<String>();
		linkedList.add("This");
		linkedList.add("is");
		linkedList.add("my");
		linkedList.add("testing");
		linkedList.add("of");
		linkedList.add("Linked List Implementation");

		linkedList.display();
		System.out.println("Before...");
		linkedList.delete();
		linkedList.display();
	}
}

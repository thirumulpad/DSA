package com.ds.linkedList;

public class DoubleLinkedListDemo {

	public static void main(String[] args) {
		DoubleLinkedListImpl<String> linkedList = new DoubleLinkedListImpl<String>();
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

package com.ds.stack;

public class StackUsingLinkedListImpl {

	public static void main(String[] args) {
		StackUsingLinkedList<Integer> st = new StackUsingLinkedList<Integer>();
		st.push(2);
		st.display();
		st.push(3);
		st.display();
		st.push(4);
		st.display();

	}

}

package com.ds.stack;

public class StackUsingDArrayImpl {

	public static void main(String[] args) {

		StackUsingDynamicArray<Integer> st = new StackUsingDynamicArray<Integer>(2);
		System.out.println("size : " + st.getSize());
		st.push(10);
		System.out.println("size : " + st.getSize());
		st.push(11);
		System.out.println("size : " + st.getSize());
		st.push(12);
		System.out.println("size : " + st.getSize());
	}

}

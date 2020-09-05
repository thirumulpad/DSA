package com.ds.stack;

public class StackArrayImpl {

	public static void main(String[] args) {
		StackArray<String> st = new StackArray<String>(4);
		st.push("L");
		st.push("O");
		st.push("O");
		st.push("P");
		// st.push("S");
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}

}

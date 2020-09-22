package com.graph;

import java.util.Stack;

public class DFSGraph {

	int size;
	AdjacentList[] array;

	public DFSGraph(int size) {

		this.size = size;
		array = new AdjacentList[this.size];
		for (int i = 0; i < this.size; i++) {
			array[i] = new AdjacentList();
			array[i].head = null;
		}
	}

	public void add(int src, int dest) {
		Node newNode = new Node(dest, null);
		newNode.next = array[src].head;
		array[src].head = newNode;
	}

	public void DFSExplore(int startVertex) {
		Boolean[] visited = new Boolean[size];
		for (int i = 0; i < size; i++) {
			visited[i] = false;
		}
		Stack<Integer> st = new Stack<Integer>();
		st.push(startVertex);
		while (!st.isEmpty()) {
			int n = st.pop();
			visited[n] = true;
			st.push(n);

			Node head = array[n].head;
			Boolean isDone = true;
			while (head != null) {
				if (!visited[head.value]) {
					st.push(head.value);
					visited[head.value] = true;
					isDone = false;
					break;
				} else {
					head = head.next;
				}
			}
			if (isDone) {
				int out = st.pop();
				System.out.println("Visited Node : " + out);
			}
		}
	}

}

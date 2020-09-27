package com.graph.dfs;

import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {

	int size;
	AdjacentList[] array;

	public BFSGraph(int size) {

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

	public void BFSExplore(int startVertex) {
		Boolean[] visited = new Boolean[size];
		for (int i = 0; i < size; i++) {
			visited[i] = false;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(startVertex);
		while (!queue.isEmpty()) {
			int n = queue.poll();
			System.out.println("Visited Node : " + n);
			visited[n] = true;
			Node head = array[n].head;
			while (head != null) {
				if (!visited[head.value]) {
					queue.add(head.value);
					visited[head.value] = true;
				} else {
					head = head.next;
				}
			}
		}
	}

}

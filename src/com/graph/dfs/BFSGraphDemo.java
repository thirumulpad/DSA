package com.graph.dfs;

public class BFSGraphDemo {

	public static void main(String[] args) {
		BFSGraph bfsGraph = new BFSGraph(6);
		bfsGraph.add(0, 2);
		bfsGraph.add(0, 1);
		bfsGraph.add(1, 0);
		bfsGraph.add(2, 0);
		bfsGraph.add(2, 5);
		bfsGraph.add(5, 2);
		bfsGraph.add(1, 4);
		bfsGraph.add(1, 3);
		bfsGraph.add(4, 1);
		bfsGraph.add(3, 1);
		
		bfsGraph.BFSExplore(0);

	}

}

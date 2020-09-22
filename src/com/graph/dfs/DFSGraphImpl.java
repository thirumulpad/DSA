package com.graph.dfs;

public class DFSGraphImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSGraph dfsGraph = new DFSGraph(6);
		dfsGraph.add(0, 2);
		dfsGraph.add(0, 1);
		dfsGraph.add(1, 0);
		dfsGraph.add(2, 0);
		dfsGraph.add(2, 5);
		dfsGraph.add(5, 2);
		dfsGraph.add(1, 4);
		dfsGraph.add(1, 3);
		dfsGraph.add(4, 1);
		dfsGraph.add(3, 1);
		
		dfsGraph.DFSExplore(0);
	}

}

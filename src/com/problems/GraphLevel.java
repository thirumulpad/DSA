package com.problems;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.tree.BinaryNode;

public class GraphLevel {

	public static void main(String[] args) {
		BinaryNode tree1 = new BinaryNode(1, null, null);
		BinaryNode node1 = new BinaryNode(2, null, null);
		BinaryNode node2 = new BinaryNode(3, null, null);
		BinaryNode node3 = new BinaryNode(4, null, null);
		BinaryNode node4 = new BinaryNode(5, null, null);
		// first tree
		tree1.leftPointer = node1;
		tree1.rightPointer = node2;
		node2.leftPointer = node3;
		node2.rightPointer = node4;

		List<List<Integer>> levelList = getLevelsPrinted(tree1);
		for (List<Integer> level : levelList) {
			System.out.println(level);
		}
	}

	private static List<List<Integer>> getLevelsPrinted(BinaryNode node) {
//		List<List<Integer>> levelList = new 
		List<Integer> levelElements = new ArrayList<Integer>();
		List<List<Integer>> levelList = new ArrayList<List<Integer>>();

		Queue<BinaryNode> nodesQueue = new LinkedList<BinaryNode>();
		nodesQueue.add(node);
		int prevLevel = 1;
		int currentLevel = 0;

		while (!nodesQueue.isEmpty()) {
			BinaryNode newNode = nodesQueue.poll();
			levelElements.add(newNode.value);

			if (newNode.leftPointer != null) {
				nodesQueue.add(newNode.leftPointer);
				currentLevel++;
			}
			if (newNode.rightPointer != null) {
				nodesQueue.add(newNode.rightPointer);
				currentLevel++;
			}
			prevLevel--;
			if (prevLevel == 0) {
				levelList.add(levelElements);
				prevLevel = currentLevel;
				currentLevel = 0;
				levelElements = new ArrayList<Integer>();
			}
		}

		return levelList;
	}
}

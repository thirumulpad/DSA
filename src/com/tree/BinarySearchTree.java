package com.tree;

import java.util.ArrayList;

public class BinarySearchTree {
	public BinaryNode root;
	ArrayList<Integer> visitNodes = new ArrayList<Integer>();
	int steps = 0;

	public BinarySearchTree() {
		root = null;
	}

	public void findPath(int searchValue, BinaryNode currentNode) {

		if (!visitNodes.contains(currentNode.value)) {
			steps++;
			visitNodes.add(currentNode.value);
		} else {
			steps--;
		}

		if (currentNode.value == searchValue)
			return;
		if (searchValue > currentNode.value)
			findPath(searchValue, currentNode.rightPointer);
		if (searchValue < currentNode.value)
			findPath(searchValue, currentNode.leftPointer);
	}

	public void addNode(BinaryNode startNode, BinaryNode newNode) {

		if (root == null) {
			root = newNode;
			return;
		}
		if (newNode.value > startNode.value && startNode.rightPointer == null) {
			startNode.rightPointer = newNode;
		}
		if (newNode.value < startNode.value && startNode.leftPointer == null) {
			startNode.leftPointer = newNode;
		}
		if (newNode.value > startNode.value) {

			addNode(startNode.rightPointer, newNode);
		}
		if (newNode.value < startNode.value) {

			addNode(startNode.leftPointer, newNode);
		}
	}

	public void search(int value, BinaryNode startNode) {
		if (null == startNode) {
			System.out.println("node is not found");
			return;
		}
		if (value > startNode.value)
			search(value, startNode.rightPointer);
		if (value < startNode.value)
			search(value, startNode.leftPointer);
		if (value == startNode.value) {
			System.out.println("node is found");
			return;
		}
	}

	public BinaryNode createNode(int value) {
		return new BinaryNode(value, null, null);
	}
}

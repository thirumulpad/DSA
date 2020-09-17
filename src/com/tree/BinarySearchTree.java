package com.tree;

public class BinarySearchTree {
	BinaryNode root;

	public BinarySearchTree() {
		root = null;
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

package com.problems;

import java.util.LinkedList;
import java.util.List;

import com.tree.BinaryNode;
import com.tree.BinarySearchTree;

public class SimilarBinaryTree {

	public static void main(String[] args) {
		BinarySearchTree bst1 = new BinarySearchTree();
		bst1.addNode(bst1.root, bst1.createNode(4));
		bst1.addNode(bst1.root, bst1.createNode(3));
		bst1.addNode(bst1.root, bst1.createNode(6));
		BinarySearchTree bst2 = new BinarySearchTree();
		bst2.addNode(bst2.root, bst2.createNode(6));
		bst2.addNode(bst2.root, bst2.createNode(3));
		bst2.addNode(bst2.root, bst2.createNode(4));
		compareTree(bst1, bst2);
	}

	public static void compareTree(BinarySearchTree bst1, BinarySearchTree bst2) {
		List<Integer> linkedList1 = new LinkedList<Integer>();
		explore(bst1.root, linkedList1);
		List<Integer> linkedList2 = new LinkedList<Integer>();
		explore(bst2.root, linkedList2);

		if (linkedList1.equals(linkedList2))
			System.out.println("trees are equal");
		else
			System.out.println("trees are not equal");

		System.out.println(linkedList1);
		System.out.println(linkedList2);

	}

	private static void explore(BinaryNode currentNode, List<Integer> linkedList) {

		if (currentNode == null)
			return;
		explore(currentNode.leftPointer, linkedList);
		linkedList.add(currentNode.value);
		explore(currentNode.rightPointer, linkedList);

	}
}

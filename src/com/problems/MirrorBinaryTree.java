package com.problems;

import java.util.LinkedList;
import java.util.List;

import com.tree.BinaryNode;

public class MirrorBinaryTree {

	public static void main(String[] args) {

		List<Integer> linkedListForTree1 = new LinkedList<Integer>();
		List<Integer> linkedListForTree2 = new LinkedList<Integer>();

		BinaryNode tree1 = new BinaryNode(10, null, null);
		BinaryNode tree2 = new BinaryNode(10, null, null);
		BinaryNode node1 = new BinaryNode(7, null, null);
		BinaryNode node2 = new BinaryNode(13, null, null);
		BinaryNode node3 = new BinaryNode(15, null, null);
		BinaryNode node4 = new BinaryNode(12, null, null);
		BinaryNode node11 = new BinaryNode(7, null, null);
		BinaryNode node22 = new BinaryNode(13, null, null);
		BinaryNode node33 = new BinaryNode(12, null, null);
		BinaryNode node44 = new BinaryNode(15, null, null);
		// first tree
		tree1.leftPointer = node1;
		tree1.rightPointer = node2;
		node2.leftPointer = node3;
		node2.rightPointer = node4;
		// second tree
		tree2.leftPointer = node22;
		tree2.rightPointer = node11;
		node22.leftPointer = node44;
		node22.rightPointer = node33;

		linkedListForTree1 = exploreTLR(tree1, linkedListForTree1);
		System.out.println(linkedListForTree1);
		linkedListForTree1 = exploreTRL(tree2, linkedListForTree2);
		System.out.println(linkedListForTree2);
		if (linkedListForTree1.equals(linkedListForTree2)) {
			System.out.println("Trees are mirror images");
		} else {
			System.out.println("Trees are not mirror images");
		}

	}

	private static List<Integer> exploreTLR(BinaryNode node, List<Integer> list) {

		if (node != null) {
			list.add(node.value);
			exploreTLR(node.leftPointer, list);
			exploreTLR(node.rightPointer, list);
		}

		return list;
	}

	private static List<Integer> exploreTRL(BinaryNode node, List<Integer> list) {

		if (node != null) {
			list.add(node.value);
			exploreTLR(node.rightPointer, list);
			exploreTLR(node.leftPointer, list);
		}

		return list;
	}
}

package com.problems;

import java.util.Stack;

public class WordDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] dic = { "hot", "dot", "lot", "log", "dog", "cog" };
		String start = "hit";
		String end = "cog";

		findPath(dic, start, end);
	}

	public static boolean findPath(String[] dictionary, String startWord, String endWord) {
		boolean isFound = false;

		boolean[] visited = new boolean[dictionary.length];
		Stack<String> stack = new Stack<String>();

		stack.push(startWord);
		while (!stack.isEmpty()) {
			String word = stack.pop();
			if (distance(word, endWord) == 0) {
				stack.push(word);
				System.out.println(stack);
				isFound = true;
				break;
			}
			for (int i = 0; i < dictionary.length; i++) {
				if (visited[i]) {
					continue;
				}
				int distance = distance(word, dictionary[i]);
				if (distance == 1) {
					visited[i] = true;
					stack.push(word);
					stack.push(dictionary[i]);
				}
			}
		}
		return isFound;
	}

	private static int distance(String word, String endWord) {
		int distance = word.length();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == endWord.charAt(i))
				distance--;
		}
		return distance;
	}

}

package com.problems;

import java.util.Arrays;

public class SimilarWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "LOOP";
		String word2 = "POOL";

		boolean isSimilar = isSimilar(word1, word2);
		System.out.println("isSimilar ? " + isSimilar);
	}

	private static boolean isSimilar(String word1, String word2) {

		if (word1.length() != word2.length())
			return false;
		char[] word1Ch = word1.toCharArray();
		Arrays.sort(word1Ch);
		char[] word2Ch = word2.toCharArray();
		Arrays.sort(word2Ch);

		for (int i = 0; i < word1Ch.length; i++) {
			if (word1Ch[i] != word2Ch[i])
				return false;
		}

		return true;
	}

}

package com.problems;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Option {
	public int nextIndex;
	public List<String> listOfWords = new ArrayList<String>();

	public Option(int nextIndex, List<String> listOfWords) {
		this.nextIndex = nextIndex;
		this.listOfWords.addAll(listOfWords);
	}
}

public class WordBreakProblem {

	Set<String> dictionary = new HashSet<String>();

	public WordBreakProblem() {
		dictionary.add("mobile");
		dictionary.add("samsung");
		dictionary.add("sam");
		dictionary.add("sung");
		dictionary.add("mango");
		dictionary.add("man");
		dictionary.add("icecream");
		dictionary.add("and");
		dictionary.add("go");
		dictionary.add("i");
		dictionary.add("like");
		dictionary.add("ice");
		dictionary.add("cream");
	}

	public static void main(String[] args) {
		new WordBreakProblem().breakWordNow("ilikesamsungandmango");

	}

	private void breakWordNow(String word) {

		Queue<Option> q = new LinkedList<Option>();
		q.add(new Option(0, new ArrayList<String>()));

		while (!q.isEmpty()) {
			Option option = q.poll();
			if (option.nextIndex >= word.length()) {
				System.out.println(option.listOfWords);
			}

			for (int i = option.nextIndex; i <= word.length(); i++) {
				String oneWord = word.substring(option.nextIndex, i);
				if (dictionary.contains(oneWord)) {
					Option newOption = new Option(i, option.listOfWords);
					newOption.listOfWords.add(oneWord);
					q.add(newOption);
				}
			}
		}
	}
}

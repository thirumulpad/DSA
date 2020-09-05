package com.problems;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class KeyPhrase {

	public static void main(String[] args) {

		List<String> exceptions = new ArrayList<String>();
		Map<String, Integer> wordFrequencyMap = new HashMap<String, Integer>();
		int frequency = 1;

		String text = "Big O time is the language and metric we use to describe the efficiency of algorithms. Not understanding "
				+ "it thoroughly can really hurt you in developing an algorithm. Not only might you be judged harshly for "
				+ "not really understanding big 0, but you will also struggle to judge when your algorithm is getting faster or "
				+ "slower.";

		String[] words = text.split(" ");

		exceptions.add("a");
		exceptions.add("the");
		exceptions.add("by");
		exceptions.add("to");
		exceptions.add("and");
		exceptions.add("of");
		exceptions.add("is");
		exceptions.add("or");
		exceptions.add(",");
		exceptions.add(".");
		for (String word : words) {
			word = word.trim().toLowerCase();
			if (exceptions.contains(word)) {
				continue;
			}
			if (wordFrequencyMap.containsKey(word)) {
				frequency = wordFrequencyMap.get(word);
				frequency = frequency + 1;
				wordFrequencyMap.put(word, frequency);
			} else {
				wordFrequencyMap.put(word, frequency);
			}
		}
		for (String key : wordFrequencyMap.keySet()) {
			System.out.println(key + ":" + wordFrequencyMap.get(key));
		}

	}

}

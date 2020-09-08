package com.problems;

import java.util.PriorityQueue;

public class TopMoviesInStream {

	public static void main(String[] args) {
		int[] streamRating = { 1, 2, 5, 4, 3, 3, 2, 1,5 };

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int k = 3;
		for (int i = 0; i < streamRating.length; i++) {
			pq.add(streamRating[i]);
			if (pq.size() > k)
				pq.poll();
			System.out.println(pq.toString());
		}

		System.out.println("final : " + pq.toString());
	}

}

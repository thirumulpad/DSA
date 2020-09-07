package com.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FriendCircle {

	public static void main(String[] args) {
		int[][] connections = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 0, 0 }, { 0, 1, 1, 0, 0 }, { 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 1, 1 }

		};

		List<ArrayList<Integer>> listOfCircles = getFriendCircles(connections);
		for (ArrayList<Integer> arrayList : listOfCircles) {
			System.out.println(arrayList);
		}
	}

	private static List<ArrayList<Integer>> getFriendCircles(int[][] connections) {

		List<ArrayList<Integer>> listOfCircles = new ArrayList<ArrayList<Integer>>();
		boolean[] visited = new boolean[connections.length];

		for (int row = 0; row < connections.length; row++) {
			if (visited[row]) {
				continue;
			}
			visited[row] = true;

			Queue<Integer> circleQueue = new LinkedList<Integer>();
			circleQueue.add(row);
			ArrayList<Integer> listOfFriends = new ArrayList<Integer>();
			while (!circleQueue.isEmpty()) {
				int userId = circleQueue.poll();
				listOfFriends.add(userId);
				for (int friendsId = 0; friendsId < connections[0].length; friendsId++) {
					if (connections[userId][friendsId] == 1 && !visited[friendsId]) {
						circleQueue.add(friendsId);
						visited[friendsId] = true;
					}
				}
			}
			listOfCircles.add(listOfFriends);
		}
		return listOfCircles;
	}

}

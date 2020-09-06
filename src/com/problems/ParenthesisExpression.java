package com.problems;

import java.util.Stack;

public class ParenthesisExpression {

	public static void main(String[] args) {

		String expression = "(((()())))";
		Stack<Character> st1 = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			st1.push(expression.charAt(i));
		}

		Stack<Character> st2 = new Stack<Character>();
		Boolean isValid = false;

		while (!st1.isEmpty()) {
			char parn = st1.pop();
			if (parn == ')')
				st2.push(parn);
			else {
				if (st2.isEmpty()) {
					isValid = false;
					break;
				} else {
					st2.pop();
				}
			}
		}
		if (isValid && st1.isEmpty() && st2.isEmpty())
			System.out.println("expression is valid.");
		else
			System.out.println("expression is not valid.");

	}
}

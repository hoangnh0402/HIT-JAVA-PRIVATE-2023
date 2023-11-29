package Bai_1;

import java.util.Scanner;
import java.util.Stack;

public class Bai_1 {
	public static void main(String[] args) {
		String input = "{}";
		Stack<Character> stack = new Stack<>();
		int[] count = new int[3];

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					System.out.println("False");
					return;
				}
				char top = stack.pop();
				if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
					System.out.println("False");
					return;
				}
				if (c == ')') {
					count[0]++;
				} else if (c == '}') {
					count[1]++;
				} else {
					count[2]++;
				}
			}
		}

		if (stack.isEmpty()) {
			System.out.println("True");
			System.out.println("Số lượng cặp ngoặc đơn: " + count[0]);
			System.out.println("Số lượng cặp ngoặc nhọn: " + count[1]);
			System.out.println("Số lượng cặp ngoặc vuông: " + count[2]);
		} else {
			System.out.println("False");
		}
	}

}

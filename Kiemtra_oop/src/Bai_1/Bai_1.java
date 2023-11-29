package Bai_1;

import java.util.Scanner;
import java.util.Stack;

public class Bai_1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập chuỗi kí tự chứa dấu ngoặc: ");
	        String input = scanner.nextLine();

	        boolean isValid = isValidBracket(input);

	        if (isValid) {
	            System.out.println("True");
	            inrasocapngoac(input);
	        } else {
	            System.out.println("False");
	        }
	    }

	    public static boolean isValidBracket(String s) {
	        Stack<Character> stack = new Stack<>();

	        for (char c : s.toCharArray()) {
	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            } else {
	                return false;
	            }
	        }

	        return stack.isEmpty();
	    }

	    public static void inrasocapngoac(String s) {
	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < s.length(); i++) {
	            char c = s.charAt(i);

	            if (c == '(' || c == '[' || c == '{') {
	                stack.push(i);
	            } else if (c == ')' || c == ']' || c == '}') {
	                if (!stack.isEmpty()) {
	                    int start = stack.pop();
	                    String bracketPair = s.substring(start, i + 1);
	                    System.out.println(bracketPair + ": " + (i - start));
	                }
	            }
	        }
	    }
	}



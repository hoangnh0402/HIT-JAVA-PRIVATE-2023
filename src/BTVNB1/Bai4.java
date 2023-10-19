package BTVNB1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		String[] tokens = input.split(" ");// tach phep toan nhap vao thanh 1 mang cac chuoi dua tren khoang trang

		if (tokens.length != 3) {
			System.out.println("KHONG HOP LE!");
			return;
		}

		int num1 = Integer.parseInt(tokens[0]);// chuyen tokens[0] thanh so nguyen va luu vao bien num1
		int num2 = Integer.parseInt(tokens[2]);// chuyen tokens[2] thanh so nguyen va luu vao bien num2
		String operator = tokens[1]; // toan tu duoc luu vao tokens[1] gan vao bien operator
		int result = 0;

		switch (operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			if (num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("Khong the chia cho 0");
				return;
			}
			break;
		default:
			System.out.println("Phep toan khonghop le");
			return;
		}

		System.out.println(result);
	}
}

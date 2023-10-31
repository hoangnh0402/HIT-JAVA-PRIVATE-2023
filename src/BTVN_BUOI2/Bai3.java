package BTVN_BUOI2;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		int letterCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		for (char c : input.toCharArray()) {
			if (Character.isLetter(c)) {
				letterCount++;
			} else if (Character.isDigit(c)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}

		System.out.println(letterCount + " " + digitCount  + " " + specialCharCount);

		scanner.close();
	}
}

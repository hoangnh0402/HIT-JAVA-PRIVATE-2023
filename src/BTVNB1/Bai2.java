package BTVNB1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int decimalNumber = scanner.nextInt();
		int targetBase = scanner.nextInt();

		if (targetBase == 2) {
			String binaryResult = decimalToBase(decimalNumber, 2);
			System.out.println(binaryResult);
		} else if (targetBase == 8) {
			String octalResult = decimalToBase(decimalNumber, 8);
			System.out.println(octalResult);
		} else if (targetBase == 16) {
			String hexadecimalResult = decimalToBase(decimalNumber, 16);
			System.out.println(hexadecimalResult);
		} else {
			System.out.println("Khong hop le.");
		}
	}

	public static String decimalToBase(int decimalNumber, int base) {
		if (base < 2 || base > 16) {
			return "Khong hop le.";
		}

		String result = Integer.toString(decimalNumber, base);

		if (base == 16) {
			result = result.toUpperCase();
		}

		return result;
	}
}

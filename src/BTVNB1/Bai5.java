package BTVNB1;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[5];

		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}

		Arrays.sort(numbers);

		int largest1 = numbers[4];
		int largest2 = numbers[3];

		System.out.print(largest2 + " ");
		System.out.println(largest1);
	}
}

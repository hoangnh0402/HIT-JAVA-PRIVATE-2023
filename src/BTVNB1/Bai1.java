package BTVNB1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int gcdAB = gcd(a, b);
		int gcdABC = gcd(gcdAB, c);
		int lcmAB = (a * b) / gcdAB; // BSCNN của a và b
		int lcmABC = (lcmAB * c) / gcdABC; // BSCNN của a, b, và c

		System.out.print(lcmABC + " ");
		System.out.print(gcdABC);

	}

	// Hàm tính ước số chung lớn nhất của 2 số
	public static int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);
	}
}

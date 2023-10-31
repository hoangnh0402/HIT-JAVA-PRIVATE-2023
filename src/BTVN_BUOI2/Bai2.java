package BTVN_BUOI2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		int[] b = new int[n + 1];

		int index = 0; 

		for (int num : a) {
		    num = sc.nextInt();
		    a[index] = num;
		    b[index + 1] = b[index] + num;
		    index++;
		}


		int q = sc.nextInt();
		for (int i = 1; i <= q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(b[r] - b[l - 1]);
		}
		sc.close();
	}
}

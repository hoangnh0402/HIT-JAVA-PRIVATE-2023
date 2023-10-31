package BTVN_BUOI2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử trong mảng n: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Nhập phần tử mảng: \n");
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		Arrays.sort(arr);

		int k = 0;
		int maxk = 0;
		int cs = 0;
		for (int i = 0; i < n; i++) {
			if (i > 0 && arr[i] != arr[i - 1]) {
				if (k > maxk) {
					maxk = k;
					cs = arr[i - 1];
				}
				k = 1;
			} else
				k++;
		}
		if (k > maxk) {
			maxk = k;
			cs = arr[n - 1];
		}
		System.out.println("số có số lần xuất hiện nhiều nhất và số lần xuất hiện của nó: ");
		System.out.println(cs + " " + maxk);
		s.close();
	}

}


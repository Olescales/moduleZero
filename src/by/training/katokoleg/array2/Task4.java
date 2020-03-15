package by.htp.katokoleg.array2.main;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {

		int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + "   ");
		}
		System.out.println();
		System.out.println("--------------------------");

		int counter = 0;
		int n = 0;
		do {
			for (int j = 1; j < 10; j++) {
				if (a[j] > a[j - 1]) {
					int t = 0;
					t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
					counter++;
				}

			}
			n++;
		} while (n != 9);

		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + "   ");
		}

		System.out.println(counter);
	}
}

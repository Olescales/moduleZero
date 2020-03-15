package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {

		int m;
		int n;

		Random random = new Random();

		m = random.nextInt(10) + 5;
		n = random.nextInt(10) + 5;

		System.out.println("number of strings: " + m);
		System.out.println("number of elements in string: " + n);

		int[][] multArray = new int[m][n];

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				multArray[i][j] = random.nextInt(10);
				System.out.printf("[%4d]", multArray[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < multArray.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < multArray[0].length; j++) {
					System.out.printf("[%4d]", multArray[i][j]);
				}
			} else if (i % 2 == 1) {
				for (int j = multArray[0].length - 1; j >= 0; j--) {
					System.out.printf("[%4d]", multArray[i][j]);
				}
			}
			System.out.println();
		}
	}

}

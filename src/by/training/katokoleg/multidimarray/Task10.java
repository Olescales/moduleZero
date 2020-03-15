package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {

		int n;

		Random random = new Random();

		n = random.nextInt(10) + 5;

		System.out.println("number of strings: " + n);
		System.out.println("number of elements in string: " + n);

		int[][] multArray = new int[n][n];

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				multArray[i][j] = random.nextInt(10);
				System.out.printf("[%4d]", multArray[i][j]);
			}
			System.out.println();
		}

		int k = random.nextInt(n);
		int p = random.nextInt(n);

		System.out.println("k = " + k);
		System.out.println("p = " + p);

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				if (i == k) {
					System.out.printf("[%4d]",multArray[i][j]);
				}
			}
		}
		System.out.println();
		
		for (int j = 0; j < multArray[0].length; j++) {
			for (int i = 0; i < multArray.length; i++) {
				if (j == p) {
					System.out.printf("[%4d]",multArray[i][j]);
				} 
			}
		}
	}

}

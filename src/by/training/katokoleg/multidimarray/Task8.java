package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

public class Task8 {

	public static void main(String[] args) {

		int n;
		int m;

		Random random = new Random();

		n = random.nextInt(6) + 2;
		m = random.nextInt(10) + 2;

		System.out.println("number of string: " + n);
		System.out.println("number of elements in string: " + m);

		int[][] multArray = new int[n][m];

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				multArray[i][j] = random.nextInt(10);
				System.out.printf("[%4d]", multArray[i][j]);
			}
			System.out.println();
		}

		int sum = 0;
		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				if (multArray[i][j] == 7) {
					sum++ ;
				}

			}
		}
		System.out.print("sum = " + sum);
		
	}

}

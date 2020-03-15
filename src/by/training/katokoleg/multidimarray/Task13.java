package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

public class Task13 {

	public static void main(String[] args) {
		
		int n;

		Random random = new Random();

		n = random.nextInt(10/2) * 2;

		System.out.println("number of strings: " + n);
		System.out.println("number of elements in string: " + n);

		int[][] multArray = new int[n][n];

		
		for (int i = 0; i < multArray.length; i++) {
			int numberForEven = 1;
			int numberForOdd = n;
			if (i % 2 == 0) {
				for (int j = 0; j < multArray[0].length; j++) {
					multArray[i][j] = numberForEven;
					numberForEven++;
					System.out.printf("[%4d]", multArray[i][j]);
				}
			} else if (i % 2 == 1) {
				for (int j = multArray[0].length - 1; j >= 0; j--) {
					multArray[i][j] = numberForOdd;
					numberForOdd--;
					System.out.printf("[%4d]", multArray[i][j]);
				}
			}
			System.out.println();
		}


	}

}

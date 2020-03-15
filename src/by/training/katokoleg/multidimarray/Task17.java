package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

public class Task17 {

	public static void main(String[] args) {
		
		int n;

		Random random = new Random();

		n = random.nextInt(10/2) * 2;

		System.out.println("number of strings: " + n);
		System.out.println("number of elements in string: " + n);

		int[][] multArray = new int[n][n];

		
		
		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				if (i > 0 && i < n-1 && j > 0 && j < n - 1 ) {
					multArray[i][j] = 1;
					
				} else {
					multArray[i][j] = 0;
				}
				System.out.printf("[%4d]", multArray[i][j]);
			}
			System.out.println();
		}

	}

}

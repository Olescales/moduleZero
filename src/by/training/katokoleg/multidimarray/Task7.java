package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

public class Task7 {

	public static void main(String[] args) {

		Random random = new Random();

		int[][] multArray = new int[5][5];

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				multArray[i][j] = random.nextInt(20) - 10;
				System.out.printf("[%4d]",multArray[i][j]);
			}
			System.out.println();
		}

		System.out.println("======================================");
		int sum = 0;
		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				if (j % 2 == 1 & multArray[i][j] < 0) {
					sum = sum + Math.abs(multArray[i][j]);
					System.out.print(multArray[i][j] + " ");
				}

			}
		}
		System.out.println("\n" + sum);
	}
}
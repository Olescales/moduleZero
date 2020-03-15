package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

public class Task4 {

	public static void main(String[] args) {

		int x;
		int y;
		
		Random random = new Random();
		
		x = random.nextInt(6)+2;
		y = random.nextInt(10)+2;
		
		System.out.println("number of string: " + x );
		System.out.println("number of elements in string: " + y );
		
		int[][] multArray = new int[x][y];

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				multArray[i][j] = random.nextInt(10);
					System.out.print(multArray[i][j] + " ");					
			}
			System.out.println();					
		}
		
		System.out.println("======================================");
		
		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0 ; j < multArray[i].length; j++) {
				if (i == 0 ) {
					System.out.print(multArray[i][j] + " ");					
				}
				else if (i == x-1) {
					System.out.print(multArray[i][j] + " ");					
				}
			}
			if (i == x-2) {
				System.out.println();
			}
			
		}
	}

}

package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

//6. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task6 {

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
		int i  = 0;
		for (int j = 0; j < multArray[0].length; j++) {
			for (i = 0 ; i < multArray.length; i++) {
				if (j % 2 == 1 & multArray[0][j] > multArray[x-1][j] ) {
					System.out.print(multArray[i][j] + " ");					
				}
			}
			if (j % 2 == 0) {
				System.out.println();
			}
			
		}


	}

}

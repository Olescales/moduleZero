package by.htp.katokoleg.multidimarray.main;

public class Task1 {

	public static void main(String[] args) {

		int[][] multArray = new int[3][4];

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				if (j == 2) {
					multArray[i][j] = 1;
				} else {
					multArray[i][j] = 0;
				}
				System.out.print(multArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}

package by.htp.katokoleg.array2.main;

import java.util.Arrays;

public class Task11 {

	public static void main(String[] args) {

		int[] array1 = { 14, 43, 17, 2, 1, 4, 20, 18, 100, 56 };
		int[] array2 = new int[10];

		int n = 1;
		int max = array1[0];
		array2[0] = array1[0];
		array1[0] = -1;

		for (int i = 1; i < array1.length; i++) {
			if (array1[i] >= max) {
				array2[n] = array1[i];
				max = array1[i];
				array1[i] = -1;
				n++;
			}
		}
		for (int i : array1) {
			System.out.print(i + "   ");
		}
		System.out.println();
		for (int i : array2) {
			System.out.print(i + "   ");
		}
		System.out.println();
		
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == -1) {
				continue;
			}

			int counter = 0;
			for (int k = 0; k < array2.length; k++) {
				if (array2[k] != 0) {
					counter++;
				}
			}

			int j = counter - 1;
			for (; j >= 0; j--) {
				if(array2[j] > array1[i]) {
					array2[j+1] = array2[j];
					
				} else {
					break;
				}
			}
			array2[j+1] = array1[i];
			System.out.println("for " + array1[i] + " counter = " + counter);
		}
		System.out.println(Arrays.toString(array2));
	}
}
package by.htp.katokoleg.array2.main;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {

		int[] array = { 18, 4, 5, 87, 104, 34, 3, 456, 598, 2, 56, 57, 57, 57 };
		int temp;
		int step;
		
		System.out.println(Arrays.toString(array));
		System.out.println();
		if (array.length % 2 == 1) {
			step = array.length + 1;
		} else {
			step = array.length;
		}

		do {
			step /= 1.5;
			System.out.println("step = " + step);
			
			for (int i = 0; i+step < array.length; i++) {
				if (array[i] > array[i + step]) {
					temp = array[i + step];
					array[i + step] = array[i];
					array[i] = temp;
				}
			}
			System.out.println(Arrays.toString(array));
			System.out.println();
		} while (step > 1);

	
	}
}

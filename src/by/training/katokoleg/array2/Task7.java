package by.htp.katokoleg.array2.main;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {

		int[] array1 = { 3, 4,5,8,9,18, 34, 45, 87, 104 };
		int[] array2 = { 2, 56, 57, 57, 57, 456, 598 };

		int arrayLength = array1.length + array2.length;

		int[] result = new int[arrayLength];

		int a = 0;
		int b = 0;

		for (int i = 0; i < result.length; i++) {

			if (a == array1.length) {
				result[i] = array2[b];
				b++;
			} else if (b == array2.length) {
				result[i] = array1[a];
				a++;
			} else {
				if (array1[a] < array2[b]) {
					result[i] = array1[a];
					a++;
				} else {
					result[i] = array2[b];
					b++;
				}
			}
			System.out.println(Arrays.toString(result) + " ");

		}

	}
}

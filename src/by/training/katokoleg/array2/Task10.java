package by.htp.katokoleg.array2.main;

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		int[] array = {8,4,5,4,4,5,7,4,4,19};
		int[] outputArray = new int[10];
		
		for (int i = 0; i < outputArray.length; i++) {
			outputArray[i] = -1;
		}
		for (int i = 0; i < array.length; i++) {
			int counter = 0;
			int plus = -1;
			for (int j = 0; j < array.length; j++) {				
				if (array[i] > array[j]) {
					counter++;
				} else if (array[i] == array[j]) {
					plus++;
				}
			}
			System.out.println("For digit " + array[i] + " counter = " + counter + " and plus = " + plus);
			outputArray[counter] = array[i];
			if (plus != 0) {
				for (int k = counter+1; k <=counter + plus; k++) {
					outputArray[k] = array[i];
				}
			}
		}
		System.out.println(Arrays.toString(outputArray));
	}

}

package by.htp.katokoleg.array2.main;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {

		
		
		Random rd = new Random();

		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = rd.nextInt(10);
			System.out.print(a[i] + "   ");
		}
		System.out.println();
		System.out.println("--------------------------");
		
		for (int i = 0; i < 10; i++) { 
			int max = 0;
			for (int j = i; j < 10; j++) {
				if (a[j] > max) {
					max = a[j];
				}
			}
			for (int k = i; k < 10; k++) {
				if (a[k] == max) {
					
					a[k] = a[i];
					a[i] = max;
					break;
				}
			} 	
				System.out.print(a[i] + "   ");
			}
		

	}

}

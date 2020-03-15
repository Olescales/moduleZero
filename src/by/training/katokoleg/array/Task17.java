package by.htp.katokoleg.array.main;

import java.util.Random;

public class Task17 {

	public static void main(String[] args) {
		
		int n;
		int min = 20;

		Random rd = new Random();

		n = rd.nextInt(15) + 7;

		System.out.println("Number of elements in array : " + n);
		System.out.println("================================");

		int[] a = new int[n];
		for (int i = 0; i < n; i++) { 
			a[i] = (int)(rd.nextDouble() * 10 - 5);
			System.out.print(a[i] + "   ");
		}

		for (int i = 0; i < n; i++) { 
			if (a[i] < min ) {
				min = a[i];
			}
		}
		
		int counter = 0;
		for (int i = 0; i < n; i++) { 
			if (a[i] == min ) {
				counter++;
			}
		}
		int m = n - counter;
		int[] b = new int[m]; 
		for (int i = 0, j = 0; i < n; i++) { 
			if (a[i] != min ) {
				b[j] = a[i];
				j++;
			}
		}
		System.out.println();
		System.out.println("-----------------------------------");
		for (int j = 0; j < m; j++) { 
			System.out.print(b[j] + "; ");
		}
	}

}

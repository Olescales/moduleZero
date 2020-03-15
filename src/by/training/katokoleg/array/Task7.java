package by.htp.katokoleg.array.main;

import java.util.Random;

public class Task7 {

	public static void main(String[] args) {
		
		int n;
		int Z;
		
		Random rd = new Random();

		n = rd.nextInt(7) + 3;
		Z = rd.nextInt(50);
		
		System.out.println("Number of elements in array : " + n);
		System.out.println("Z = " + Z);
		System.out.println("================================");

		int[] a = new int[n];
		for (int i = 0; i < n; i++) { 
			a[i] = rd.nextInt(100);
			System.out.print(a[i] + "   ");
		}
		int counter = 0;
		for (int i = 0; i<a.length; i++) {
			if (a[i] > Z) {
				a[i] = Z;
				counter++;
			}
			System.out.print("\n" + a[i]);
		}
		System.out.println("\nNumber of substitutions is: " + counter);	
	}
}

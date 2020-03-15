package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task17 {

	
	public static void main(String[] args) {
		
		double a;
		double b;
		
		a = enterNumber ("Enter a: ");
		b = enterNumber ("Enter b: ");
		
		double average = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double geometric_mean = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Average  = " + average);
		System.out.println("Average geometric = " + geometric_mean);
	}

	public static int enterNumber(String message) {

		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			String S;
			S = sc.next();
			System.out.println("Its not a number: " + S);
			System.out.println("Wrong number: ");
		}
		x = sc.nextInt();

		return x;
	}
	
}

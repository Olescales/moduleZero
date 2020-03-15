package by.htp.katokoleg.embranchment.main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		double a;
		
		a = enterDouble ("Enter a: ");
		if (a > 3) {
			System.out.println("No");			
		}
		else {
			System.out.println("Yes");
		}

	}
	
	public static double enterDouble(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("Wrong number: " + S);
			System.out.println("Enter number: ");
		}
		x = sc.nextDouble();

		return x;
	}
}

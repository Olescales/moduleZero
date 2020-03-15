package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task27 {

	
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		double result1;
		double result2;
		
		a = enterNumber("Enter a:");
		b = a * a ; 
		c = b * b ;
		result1 = c * c;
		System.out.println("a in 8 degree = " + result1);
		
		result2 = result1 * b;
		System.out.println("a in 10 degree = " + result2);
	}

	public static double enterNumber(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
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

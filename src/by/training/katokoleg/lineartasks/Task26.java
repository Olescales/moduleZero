package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task26 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double angle;
		
		double square;
		
		a = enterNumber ("Enter a: ");
		b = enterNumber ("Enter b: ");
		angle = enterNumber ("Enter angle (from 0 up to 90 degrees): ");
		
		square = ( a * b * Math.sin(Math.toRadians(angle))) / 2;

		
		System.out.println("Square = " + square);
	}

	public static double enterNumber(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("You entered wrong number: " + S);
			System.out.println("Enter number: ");
		}
		x = sc.nextDouble();

		return x;
	}
	
}

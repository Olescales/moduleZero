package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task23 {

	
	public static void main(String[] args) {
		
		double outerradius;
		double innerradius;
		
		double square;
		
		outerradius = enterNumber ("Enter outer radius of ring: ");
		innerradius = enterNumber ("Enter inner radius of ring(it must be bigger than outer radius):  ");
		
		square = Math.PI * (Math.pow(outerradius, 2) - Math.pow(innerradius, 2));
		System.out.println("Ring square: " + square);
	}

	public static double enterNumber(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("Its not a number: " + S);
			System.out.println("Enter number: ");
		}
		x = sc.nextDouble();

		return x;
	}
	
}

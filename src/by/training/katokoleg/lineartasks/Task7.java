package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task7 {


	
	public static void main(String[] args) {
		
		double width;
		double length;
		
		double square;
		
		width = enterSilable("Enter rectangle width: ");
		
		length = 2 * width;		
		
		square = length * width;
		
		System.out.println("Square :" + square);

	}
	public static double enterSilable(String message) {

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

package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		double x;
		double y;
		
		double result;
		
		x = enterSilable(" x: "); 
		y = enterSilable(" y: ");

		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.print(result);
		
	}

	public static double enterSilable(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println(S);
		}
		x = sc.nextDouble();

		return x;
	}
	
}

package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task8 {
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double result;		
		
		
		a = enterSilable("Enter a: "); 
		b = enterSilable("Enter b: ");
		c = enterSilable("Enter c: ");
		
		double root = Math.pow(b , 2)+ (4 * a * c);
		
		result = (b + Math.sqrt(root)) / (2 * a) - (Math.pow(a, 3) * c) + (1 / Math.pow(b, 2));
		System.out.print("Result: " + result);
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

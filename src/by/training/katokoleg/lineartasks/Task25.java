package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task25 {


	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double x1;
		double x2;
		
		a = enterNumber ("Enter а: ");
		b = enterNumber ("Enter b: ");
		c = enterNumber ("Enter c: ");
		
		double descriminant;
		descriminant = Math.pow(b, 2) - (4 * a * c);
		
		if (descriminant == 0) {
			x1 = x2 = - (b / 2 * a);
			System.out.println("Equation's roots is: ");
			System.out.println("x1 = x2 = " + x1);
		}
		
		if (descriminant > 0) {
			x1 =  ( -b + Math.sqrt(descriminant)) / ( 2 * a );
			x2 =  ( b + Math.sqrt(descriminant)) / ( 2 * a );
			System.out.println("Equation's roots is: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		if (descriminant < 0) {
		System.out.println("Descriminant < 0 . Try again");
		}
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

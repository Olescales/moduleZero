package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		double z;

		a = enterSilable("enter a: ");
		b = enterSilable("enter b: ");
		c = enterSilable("enter c: ");

		z = ((a - 3) * b / 2) + c;
		System.out.print("z = " + z);
	}

	public static double enterSilable(String message) {
		
		double x;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while ( !sc.hasNextDouble() ) {
			String S;
			S = sc.next();
			System.out.println("Its not a number: " + S);
			System.out.println("Enter number: ");
		}
			x = sc.nextDouble();
			
		return x; 
	}
}

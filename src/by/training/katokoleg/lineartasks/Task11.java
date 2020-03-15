package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
	
		double katet_a;
		double katet_b;
		
		double gip;
		double perimetr;
		double square;
		double sem;
		
		katet_a = enterSilable("Enter first katet: "); 
		katet_b = enterSilable("Enter second katet: ");
		
		gip = Math.sqrt(Math.pow(katet_a, 2) + Math.pow(katet_b, 2));
		perimetr = gip + katet_a + katet_b;
		
		sem = perimetr/2;
		
		square = Math.sqrt(sem * (sem - katet_a) * (sem - katet_b) * (sem - gip));
		System.out.println("Perimetr = " + perimetr);
		System.out.print("Square = " + square);
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


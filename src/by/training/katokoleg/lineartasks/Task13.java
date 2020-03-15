package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;


public class Task13 {

	public static void main(String[] args) {
		
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double x3;
		double y3;
		
		double delta_x12;
		double delta_y12;
		
		double delta_x13;
		double delta_y13;
		
		double delta_x23;
		double delta_y23;
		
		double side1;
		double side2;
		double side3;
		
		x1 = enterSilable("Enter coord X point 1: "); 
		y1 = enterSilable("Enter coord Y point 1: ");
		
		x2 = enterSilable("Enter coord X point 2: "); 
		y2 = enterSilable("Enter coord Y point 2: ");
		
		x3 = enterSilable("Enter coord X point 3: "); 
		y3 = enterSilable("Enter coord Y point 3: ");
		
		delta_x12 = x2 - x1;
		delta_y12 = y2 - y1;
		delta_x13 = x3 - x1;
		delta_y13 = y3 - y1;
		delta_x23 = x2 - x3;
		delta_y23 = y2 - y3;
		
		side1 = Math.sqrt(Math.pow(delta_x12, 2) + Math.pow(delta_y12, 2));
		side2 = Math.sqrt(Math.pow(delta_x13, 2) + Math.pow(delta_y13, 2));
		side3 = Math.sqrt(Math.pow(delta_x23, 2) + Math.pow(delta_y23, 2));
	
		double per = side1 + side2 + side3;
		double semiper = per / 2;
		double square = Math.sqrt(semiper * (semiper - side1) * (semiper - side2) * (semiper - side3));
		
		System.out.println("Perimetr: " + per);
		System.out.println("Square: " + square);
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

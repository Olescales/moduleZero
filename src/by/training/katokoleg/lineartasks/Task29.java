package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task29 {
	
	public static void main(String[] args) {
		
		double A;
		double B;
		double C;
		
		double angleAB;
		double angleBC;
		double angleAC;
		
		A = enterNumber ("Enter length of side a ");
		B = enterNumber ("Enter length of side b ");
		C = enterNumber ("Enter length of side c ");
		
		angleAB = Math.acos((A * A + B * B - C * C) / (2 * A * B));
		angleBC = Math.acos((B * B + C * C - A * A) / (2 * B * C));
		angleAC = Math.acos((A * A + C * C - B * B) / (2 * A * C));
		
		System.out.println("angleAB in degrees:" + Math.toDegrees(angleAB));
		System.out.println("angleBC in degrees: " + Math.toDegrees(angleBC));
		System.out.println("angleAC in degrees: " + Math.toDegrees(angleAC));
		
		System.out.println("angleAB in radians: " + angleAB);
		System.out.println("angleBC in radians: " + angleBC);
		System.out.println("angleAC in radians: " + angleAC);
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

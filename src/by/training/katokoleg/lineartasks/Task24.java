package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task24 {


	public static void main(String[] args) {
		
		double a;
		double b;


		double katet;
		double height;
		double square;

		a = enterNumber("Enter bigger trapeze basis: ");
		b = enterNumber("Enter smaller trapeze basis: ");

		double angle = 44;
		
		while (angle < 45 || angle > 90) {

			angle = enterAngle("Enter correct angle (from 46 to 89 degrees): ");
			if (angle > 45 && angle < 90) {
				break;
			}
		}

		katet = (a - b) / 2;

		double angleInRadians = Math.tan(Math.toRadians(angle));

		height = katet * angleInRadians;

		System.out.println("In radians: " + angleInRadians);
		square = ((a + b) / 2) * height;
		System.out.println("Trapeze square: " + square);
	}

	public static double enterAngle(String message) {

		double angle;
		char b = '\u00B0';
	

		Scanner sc = new Scanner(System.in);
		System.out.print(message);

		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("You entered in correct angle: " + S + " " + b);
			System.out.println("Enter correct angle : ");
		}
		angle = sc.nextDouble();
		return angle;
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

package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task5 {


	public static void main(String[] args) {

		double a;
		double b;

		double z;

		a = enterSilable("enter a: ");
		b = enterSilable("enter b: ");

		z = (a + b) / 2;
		System.out.print("z = " + z);

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

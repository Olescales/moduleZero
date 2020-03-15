package by.htp.katokoleg.cycles.main;

import java.util.Scanner;

public class Task28 {

	public static void main(String[] args) {

		double x;
		double y;

		double z;

		char sign;

		do {

			x = enterDouble("Enter x: ");
			y = enterDouble("Enter y: ");

			System.out.println("x " + x);
			System.out.println("y " + y);
			System.out.println("---------------------------");

			System.out.println("What do you want to do with the numbers?");
			System.out.println("Enter (+ , - , / , * ) or 0 to Exit from the programm");

			do {
			sign = enterSign("Enter sign of operation (+ , - , / , * ): ");

			System.out.println(sign);
					if (sign == '+') {
						z = x + y;
						System.out.println("z = " + z);
					} else if (sign == '-') {
						z = x - y;
						System.out.println("z = " + z);
					} else if (sign == '/') {
						z = x / y;
						System.out.println("z = " + z);
					} else if (sign == '*') {
						z = x * y;
						System.out.println("z = " + z);
					}
					else if (sign == '0') {
						break;
					}
				} while (sign != '+' & sign != '-' & sign != '*' & sign != '/' );

		} while (sign != '0'); 
		System.out.println("Good bye!!! See you later. ");
	}
	public static double enterDouble(String message) {

		double a;

		System.out.println(message);

		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextDouble()) {
			String s;
			s = sc.next();
			System.out.println("Incorrect!  " + s);
			System.out.println(message);
		}
		a = sc.nextDouble();
		return a;
	}

	public static char enterSign(String message) {

		char a;
		String s;

		System.out.println(message);

		Scanner sc = new Scanner(System.in);

		a = sc.findInLine(".").charAt(0);
		return a;
	}

}

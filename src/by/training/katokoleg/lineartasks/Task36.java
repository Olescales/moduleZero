package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task36 {

	public static void main(String[] args) {

		int number;
		int recidue;
		int a;
		int mult_even = 1;
		int mult_odd = 1;
		float quotient;

		a = enterNumber("Enter four digit number: ");

		for (number = a; number > 0; number = number / 10) {
			
			recidue = number % 10;
			if (recidue % 2 == 0) {
				mult_even = mult_even * recidue;
			} else {
				mult_odd = mult_odd * recidue;
			}

		}

		System.out.println("Even numbers multiply:   " + mult_even);
		System.out.println("Odd numbers multiply: " + mult_odd);
		
		quotient = (float) mult_even / mult_odd;
		System.out.println("Quotient: " + quotient);

	}

	public static int enterNumber(String message) {

		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			String S;
			S = sc.next();
			System.out.println("Its not a number: " + S);
			System.out.println("Enter number: ");
		}
		x = sc.nextInt();

		return x;
	}

}

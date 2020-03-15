package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		
		int product = 1;
		int number;
		int balance;
		int a;
		
		a = enterNumber("Enter four digit number: ");
				
		for (number = a; number > 0; number = number / 10) {
		balance = number % 10;
		product = product * balance;
		
		}
		System.out.println("Result: " + product);
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

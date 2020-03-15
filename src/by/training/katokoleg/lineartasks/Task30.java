package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task30 {
	
	public static void main(String[] args) {
		
		double R1;
		double R2;
		double R3;
		
		double result;
		
		R1 = enterNumber ("Enter resistence 1:");
		R2 = enterNumber ("Enter resistence 2:");
		R3 = enterNumber ("Enter resistence 3:");

		result = 1 / R1 + 1 / R2 + 1 / R3;
				System.out.println("Resulting resistence = " + result);
	}

	public static double enterNumber(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("Its wrong number: " + S);
			System.out.println("Enter number: ");
		}
		x = sc.nextDouble();

		return x;
	}

}

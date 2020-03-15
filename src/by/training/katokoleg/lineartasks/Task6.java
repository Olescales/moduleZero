package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task6 {


	public static void main(String[] args) {
		
		int n;
		int m;
		double v;
		
		n = enterSilable("Enter number of smaller milk can: ");
		m = enterSilable("Enter number of bigger milk can: ");
		
		double prom = (double) 80 / n;
				
		v = (double) m * (prom + 12 );
		
		System.out.println("In big can " + v + " litres of milk");

	}

	public static int enterSilable(String message) {

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

package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task21 {

	
	public static void main(String[] args) {
		
		double R;
		 
		R = enterNumber ("Enter number in view nnn.ddd");
		
		System.out.println("You entered nummber: "+ R);
		
		int integer_part = (int) R;
				
		double fractional_part= R - integer_part;
		
		double y = fractional_part * 1000;
		y = Math.round(y);
		
		double x = (double) integer_part / 1000;
		
		double finish_digital = x + y;
		System.out.println("Number vice versa: " + finish_digital);
	}

	public static double enterNumber(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("Its not number: " + S);
			System.out.println("Enter number: ");
		}
		x = sc.nextDouble();

		return x;
	}
	
}

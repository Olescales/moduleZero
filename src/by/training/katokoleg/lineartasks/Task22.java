package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task22 {

	
	public static void main(String[] args) {
		
		int time_in_sec;
		
		time_in_sec = enterNumber("Enter number of seconds: ");
		
		int sec = time_in_sec % 60;
				
		int time_in_min = (time_in_sec - sec) / 60;
		
		int min = time_in_min % 60;
		
		int hours = (time_in_min - min) / 60;
		System.out.print(hours + "h " + min + "min " + sec + "sec.");
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

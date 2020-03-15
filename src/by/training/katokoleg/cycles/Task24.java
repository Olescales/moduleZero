package by.htp.katokoleg.cycles.main;

import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		
		int number;
		int mirrorNumber = 0;
		int recidue;
		int sum_even = 0;
		

		number = enterNumber("Enter number: ");

		for (int i = number; i > 0; i = i / 10) {
			
			recidue = i % 10;
			if (recidue % 2 == 0) {
				sum_even += recidue;
			} 
			mirrorNumber = mirrorNumber * 10 + recidue;
		}
		
		System.out.println(sum_even);
		System.out.print("Number: " + number);
		System.out.println(" And its mirror number " + mirrorNumber);
		
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

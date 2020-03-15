package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task34 {

	public static void main(String[] args) {

		long amount_bit;
		long bit;
		long bite;
		long kbite;
		long mbite;
		long gbite;
		long tbite;

		amount_bit = enterNumber("Enter number of bites: ");

		bit = amount_bit % 8;

		long amount_bite = (amount_bit - bit) / 8;

		bite = amount_bite % 1024;

		long amount_kbite = (amount_bite - bite) / 1024;

		kbite = amount_kbite % 1024;

		long amount_mbite = (amount_kbite - kbite) / 1024;

		mbite = amount_mbite % 1024;

		long amount_gbite = (amount_mbite - mbite) / 1024;

		gbite = amount_gbite % 1024;

		long amount_tbite = (amount_gbite - gbite) / 1024;

		tbite = amount_tbite % 1024;

		System.out.print(amount_bit + " bit ");
		System.out.print("contain:\n " + bit + "bit\n " + bite + " bite\n " + kbite + " kbite\n " + mbite + " mbite\n "
				+ gbite + " gbite\n " + tbite + " tbite");

	}

	public static long enterNumber(String message) {

		long x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextLong()) {
			String S;
			S = sc.next();
			System.out.println("Wrong number: " + S);
			System.out.println("Enter number: ");
		}
		x = sc.nextLong();

		return x;
	}

}

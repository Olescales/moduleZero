package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

			
public class Task37 {

	static boolean result = true;
	
	public static void main(String[] args) {
		
		System.out.println("Subtask 9.");
		subtask9();
		System.out.println("Subtask 8.");
		subtask8();
		System.out.println("Subtask 7.");
		subtask7();
		System.out.println("Subtask 6.");
		subtask6();
		System.out.println("Subtask 5.");
		subtask5();
		System.out.println("Subtask 4.");
		subtask4();
		System.out.println("Subtask 3.");
		subtask3();
		System.out.println("Subtask 1.");
		subtask1();
		System.out.println("Subtask 2.");
		subtask2();
	}
	
	public static void subtask9() {
		
		double a;
		double b;
		double c;
		
		double m;
		double n;
		
		a = enterDouble ("Enter a:");
		b = enterDouble ("Enter b:");
		c = enterDouble ("Enter c:");
		n = enterDouble ("Enter n:");
		m = enterDouble ("Enter m:");
		
		if (a * Math.pow(n, 2)	+ b * n + c == m) {
			System.out.println(result);
		}
		else {
			System.out.println(!result);
		}
	}
	
	public static void subtask8() {
		
		double a;
		double N;
		
		a = enterDouble ("Enter number a:");
		N = enterDouble ("Enter number N:");
		
		for(int i = 0; i<5; i++) {
			if (Math.pow(a, i) == N) {
				System.out.println(result);
				break;
			}
			else {
				System.out.println(!result);
			}
		}
	}
	
	public static void subtask7() {
	
		int number;
		
		number = enterInt ("Enter three-digit number: ");
		
		int digit1;
		int digit2;
		int digit3;
		
		digit1 = number % 10;
		System.out.println(digit1);
		number = number / 10;
		
		digit2 = number % 10;
		System.out.println(digit2);
		number = number / 10;
		
		digit3 = number % 10;
		System.out.println(digit3);
		
		if (digit1 + digit2 == digit3 ||digit1 + digit3 == digit2 ||digit2 + digit3 == digit1) {
			System.out.println(result);
		}
		else {
			System.out.println(!result);
		}
	}	
		
	public static void subtask6() {
		
		double sideA;
		double sideB;
		double sideC;
		
		sideA = enterDouble ("Enter length of side A:");
		sideB = enterDouble ("Enter length of side B:");
		sideC = enterDouble ("Enter length of side C:");
		
		if (sideA == sideB || sideA == sideC || sideB == sideC) {
			System.out.println(result);
		}
		else {
			System.out.println(!result);
		}
	}
	
	public static void subtask5() {
		
		double product = 0;
		double number;
		double balance;
		double a;
		
		a = enterInt("Enter three-digit number: ");
				
		for (number = a; number > 0; number = number / 10) {
		balance = number % 10;
		product = product + balance;
		}
		if (Math.pow(a, 2) == Math.pow(product, 3)) {
			System.out.println(result);
		}
		else {
			System.out.println(!result);
		}
	}
	
	public static void subtask4() {
		
		double coordinateX;
		
		double straightM;
		double straightN;
		
		straightM = enterDouble ("Enter coordinate of straight M: ");
		straightN = enterDouble ("Enter coordinate of straight N ( N>M ): ");
		
		coordinateX = enterDouble ("Enter coordinate X: ");
		
		if (coordinateX >= straightM && coordinateX <= straightN ) {
			System.out.println(result);
		}
		else {
			System.out.println(!result);
		}
	}
	
	public static void subtask3() {
		
		int product = 0;
		int number;
		int balance;
		int a;
		
		a = enterInt("Enter three-digit number: ");
				
		for (number = a; number > 0; number = number / 10) {
		balance = number % 10;
		product = product + balance;
		}
		if (product % 2 == 0) {
			System.out.println(result);
		}
		else {
			System.out.println(!result);
		}
			
	}
	
	public static void subtask2() {
		
		int number;
		int number1;
		int number2;
		int sum1 = 0;
		int sum2 = 0;
		
		number = enterInt("Enter four digit number: ");
		
		number1 = number / 100; 
		number2 = number % 100; 
		
		for (number = number1; number > 0; number = number / 10) {
			int balance = number % 10;
			sum1 = sum1 + balance;
		}

		for (number = number2; number > 0; number = number / 10) {
			int balance = number % 10;
			sum2 = sum2 + balance;
		}
		
		System.out.println("Sum of the first 2 digits = " + sum1);
		System.out.println("Sum of the last  2 digits = " + sum2);	
		
		if (sum1 == sum2) {
			System.out.println(result);
		}
		else {
			System.out.println(!result);
		}
	}
	
	public static void subtask1() {
	int N = 9;
	
	while (N < 10 || N >= 100) {
		
		N = enterInt("Enter double-digit number: ");
		if (N < 100 && N >= 10) {
			break;
		}
		System.out.println("It isn't double-digit number.\nEnter number correctly: ");
	}
	isN_even(N);
	}
	
	public static void isN_even(int N) {

		if (N % 2 == 0 ) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}

	public static int enterInt(String message) {

		int x;

		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextInt()) {
			String S;
			S = sc.next();
			System.out.println("Its not integer number: " + S);
			System.out.println("Enter integer number: ");
		}
		x = sc.nextInt();

		return x;
	}

	
	public static double enterDouble(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("Its not double: " + S);
			System.out.println("Enter double: ");
		}
		x = sc.nextDouble();

		return x;
	}
}

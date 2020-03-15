package by.htp.katokoleg.embranchment.main;

import java.util.Random;

public class Task30 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		Random random = new Random();
		
		a = (random.nextDouble() * 1_000_000 - 500_000);
		b = (random.nextDouble() * 1_000_000 - 500_000);
		c = (random.nextDouble() * 1_000_000 - 500_000);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("-----------------------------------");
		
		if (a > b && b > c) {
			a = a * 2;
			b = b * 2;
			c = c * 2;
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("c: " + c);
		}
		else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			System.out.println("c: " + c);
		}
	}

}

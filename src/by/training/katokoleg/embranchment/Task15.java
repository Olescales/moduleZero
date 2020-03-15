package by.htp.katokoleg.embranchment.main;

import java.util.Random;

public class Task15 {

	public static void main(String[] args) {
		
		double x;
		double y;
		
		Random random = new Random();
		
		x = (random.nextDouble() * 1_000_000) - 500_000;
		y = (random.nextDouble() * 1_000_000) - 500_000;
	
		System.out.println("x = " + x);
		System.out.println("Y = " + y);
		System.out.println("----------------------------------");
		
		while (x != y) {
		if (x < y) {
			x = (x + y) / 2;
			y = x * y * 2;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			break;
		}
		else {
			y = (x + y) / 2;
			x = x * y * 2;
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			break;
		}
		}
	}

}

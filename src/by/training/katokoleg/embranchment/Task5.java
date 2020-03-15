package by.htp.katokoleg.embranchment.main;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {
		
		int a;
		int b;
		
		Random random = new Random();
		
		a = random.nextInt();
		b = random.nextInt();
	
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		if (a < b) {
			System.out.println("A less than B");
		}
		else if (b < a) {
			System.out.println("B less than A");
		}
		else {
			System.out.println("A equally B");
		}
	
	}
}

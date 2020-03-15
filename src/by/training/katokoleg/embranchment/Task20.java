package by.htp.katokoleg.embranchment.main;

import java.util.Random;

public class Task20 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;

		Random random = new Random();

		a = random.nextInt();
		b = random.nextInt();
		c = random.nextInt();

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		
		int k;
		
		k =  (int)(Math.random() * 101 - 100);
		
		System.out.println("k = " + k);

		
		if (a % k == 0) {
			System.out.println("k is divisor of a ");
		}
		if (b % k == 0) {
			System.out.println("k is divisor of b ");
		}
		if (c % k == 0) {
			System.out.println("k is divisor of c ");
		} 
		
	}

}

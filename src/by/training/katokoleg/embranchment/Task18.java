package by.htp.katokoleg.embranchment.main;

import java.util.Random;

public class Task18 {

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
		
		int neg = 0;
		
		if (a<0) {
			neg += 1;
		}
		if (b<0) {
			neg += 1;
		}
		if (c<0) {
			neg += 1;
		}
		
		System.out.println("Amount of negative numbers: " + neg);
	}

}

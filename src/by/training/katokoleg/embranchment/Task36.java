package by.htp.katokoleg.embranchment.main;

import java.util.Random;

public class Task36 {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		Random random = new Random();
		
		x = random.nextInt();
		System.out.println("x = " + x);
		if (x <= 3) {
			y = x * (x - 3) + 9;
			System.out.println("y = " + y);
		}
		else {
			y = 1 / (x *x * x + 6);
			System.out.println("y = " + y);
		}

	}

}

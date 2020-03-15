package by.htp.katokoleg.embranchment.main;

import java.util.Random;

public class Task16 {

	public static void main(String[] args) {
			
		int x;
		int y;
		
		Random random = new Random();
		
		x = random.nextInt();
		y = random.nextInt();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		if (x > 0 & y >0 ) {
			System.out.println("The Point is in the first coordinate angle ");
		}
		else if (x < 0 & y > 0) {
			System.out.println("The Point is in the second coordinate angle ");
		}
		else if (x < 0 & y < 0) {
			System.out.println("The Point is in the third coordinate angle ");
		}
		else if (x > 0 & y < 0) {
			System.out.println("The Point is in the fourth coordinate angle ");
		}
		else if (x == 0 & y != 0) {
			System.out.println("The Point is on the coordinate axis y ");
		}
		else if (y == 0 & y != 0) {
			System.out.println("The Point is on the coordinate axis x ");
		}
		else if (x == 0 & y == 0) {
			System.out.println( "The Point is in the centre ");
		}
	}

}

package by.htp.katokoleg.embranchment.main;

public class Task29 {

	public static void main(String[] args) {
		
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		
		double deltaX;
		double deltaY;
		
		double k;
		double C;
		
		x1 = (Math.random() * 10);
		x2 = (Math.random() * 10);
		x3 = (Math.random() * 10);
		y1 = (Math.random() * 10);
		y2 = (Math.random() * 10);
		y3 = (Math.random() * 10);
			
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);
		
		deltaX = x2 - x1;
		deltaY = y2 - y1;
		
		k = deltaY / deltaX;
		C = y1 - (k * x1);
		
		if (y3 == (k * x3 + C) ) {
			System.out.println("All three points is on the straight" );
		}
		else {
			System.out.println("The points ISN'T on the straight" );
		}
	}

}

package by.htp.katokoleg.embranchment.main;

public class Task12 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
				
		a = (Math.random() * 10000000) - 10000000;
		b = (Math.random() * 10000000) - 10000000;
		c = (Math.random() * 10000000) - 10000000;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		if (a < 0 ) {
			a = Math.pow(a, 4);
			System.out.println("a = " + a);
		}
		else {
			a = Math.pow(a, 2);
			System.out.println("a =" + a);
		}
		
		if (b < 0 ) {
			b = Math.pow(b, 4);
			System.out.println("b = " + b);
		}
		else {
			b = Math.pow(b, 2);
			System.out.println("b =" + b);
		}
		if (c < 0 ) {
			c = Math.pow(c, 4);
			System.out.println("c = " + c);
		}
		else {
			c = Math.pow(c, 2);
			System.out.println("c =" + c);
		}
	}

}

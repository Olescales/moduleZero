package by.htp.katokoleg.embranchment.main;

public class Task28 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		int d;
		
		a = (int)(Math.random() * 10);
		b = (int)(Math.random() * 10);
		c = (int)(Math.random() * 10);
		
		d = (int)(Math.random() * 10);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		
		if (a != d & b != d & c != d) {
			if (d - a > d - b) {
				if (d - a > d - c) {
				System.out.println("'d - a' the largest numeric ");	
				}
				else {
					System.out.println("'d - c' the largest numeric ");	
				}
			}
			else {
				if (d - b > d - c) {
					System.out.println("'d - b' the largest numeric ");	
				}
				else {
					System.out.println("'d - c' the largest numeric ");	
				}
			}
		}
		else {
			System.out.println("Got coincidence");
			if (a == d && b == d && c == d) {
				System.out.println("All numeric equall d");	
			}
			else if (a == d && b == d) {
				System.out.println("a and b equall d");	
			}
			else if (a == d && c == d) {
				System.out.println("a and c equall d");	
			}
			else if (c == d && b == d) {
				System.out.println("c and b equall d");	
			}
			else if (a == d) {
				System.out.println("a equall d");	
			}
			else if (b == d) {
				System.out.println("b equall d");	
			}
			else if (c == d) {
				System.out.println("c equall d");	
			}
		}
	}

}

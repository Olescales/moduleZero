package by.htp.katokoleg.embranchment.main;

public class Task26 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		a = (int)(Math.random() * 100);
		b = (int)(Math.random() * 100);
		c = (int)(Math.random() * 100);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);

		if (a > b) {
			if (a > c) {
			System.out.println("a larger than others");	
			}
			else {
				System.out.println("c larger than others");	
			}
		}
		else {
			if (b > c) {
				System.out.println("b larger than others");	
			}
			else {
				System.out.println("c larger than others");	
			}
		}
		
		if (a < b) {
			if (a < c) {
			System.out.println("a smaller than others");	
			}
			else {
				System.out.println("c smaller than others");	
			}
		}
		else {
			if (b < c) {
				System.out.println("b smaller than others");	
			}
			else {
				System.out.println("c smaller than others");	
			}
		}
	}

}

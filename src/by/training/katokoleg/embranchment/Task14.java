package by.htp.katokoleg.embranchment.main;

public class Task14 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random() * 180);
		int b = (int)(Math.random() * 180);
		
		int c = 180 - a - b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		if (c > 0) {
			System.out.println("Triangle with such angles is exist");
		}
		else {
			System.out.println("There is no triangle with such angles");
		}
		
		if (a == 90 || b == 90 || c == 90) {
			System.out.println("This is rectangular triangle");
		}
	}

}

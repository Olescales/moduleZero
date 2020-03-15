package by.htp.katokoleg.embranchment.main;

public class Task7 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double x;
		
		a = (int)(Math.random() * 200 - 100);
		b = (int)(Math.random() * 200 - 100);
		c = (int)(Math.random() * 200 - 100);
		x = (int)(Math.random() * 200 - 100);
		
		double result = a * Math.pow(x, 2) + b * x + c;
		System.out.println(result);
	}

}

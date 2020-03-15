package by.htp.katokoleg.lineartasks.main;

	//Task 1

public class Task1 {
	
	public static void main (String[] args) {
	
	int x = 5;
	int y = 10;
	
	int z;
	double a;
	
	z = add(x, y);
	System.out.println("Sum: " + z);
	z = sub(x, y);
	System.out.println("Difference: " + z);
	z = mult(x, y);
	System.out.println("Multiply: " + z);
	a = div(x, y);
	System.out.println("Quotient: " + a);
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int sub(int a, int b) {
		int dif = a - b;
		return dif;
	}
	
	public static int mult(int a, int b) {
		int mult = a * b;
		return mult;
	}
	
	public static double div(double a, double b) {
	    double div = (a / b);
		return div;
	}
}
		
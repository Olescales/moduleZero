package by.htp.katokoleg.simpleclassandobjects.task1;

public class Test1 {

	private double x;
	private double y;

	public Test1() {
	}

	public Test1(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

	public void outputResult() {
		System.out.println("x = " + x + " \n" + " y = " + y);
	}

	public double add() {
			
		double sum;
		sum = x + y;
		return sum;
	}

	public double compare() {

		if (x > y) {
			return x;
		}

		return y;
	}

}

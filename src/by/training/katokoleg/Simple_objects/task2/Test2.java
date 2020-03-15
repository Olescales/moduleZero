package by.htp.katokoleg.simpleclassandproject.task2;

public class Test2 {

	private double firstVariable;
	private double secondVariable;

	public Test2(double firstVariable, double secondVariable) {
		this.firstVariable = firstVariable;
		this.secondVariable = secondVariable;
	}

	public Test2() {
		firstVariable = 0.1;
		secondVariable = 0.3;
	}

	public double getFirstVariable() {
		return firstVariable;
	}

	public void setFirstVariable(double firstVariable) {
		this.firstVariable = firstVariable;
	}

	public double getSecondVariable() {
		return secondVariable;
	}

	public void setSecondVariable(double secondVariable) {
		this.secondVariable = secondVariable;
	}

	
}

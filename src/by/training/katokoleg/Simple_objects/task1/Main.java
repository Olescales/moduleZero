package by.htp.katokoleg.simpleclassandobjects.task1;

public class Main {

	public static void main(String[] args) {
		
		double sum;
		double result;
		
		//Test1 t = new Test1(3.15351, 4.161681 );
		//t.outputResult();
		//sum = t.add(3.15351, 4.161681);
		//result = t.compare(3.15351, 4.161681);
		
		Test1 t1 = new Test1();
		t1.setX(2.35949);
		t1.setY(7.49451);
		
		sum = t1.add();
		result = t1.compare();
	System.out.println("larger number is " + result);
	System.out.println("sum = " + sum);
	}
	

}

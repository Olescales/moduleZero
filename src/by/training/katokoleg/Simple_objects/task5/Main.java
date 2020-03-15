package by.htp.katokoleg.simpleclassandobject.task5;

public class Main {

	public static void main(String[] args) {

		Counter count = new Counter(9);
		CounterLogic cl = new CounterLogic();
		System.out.println(count);
		
		count.setCurrentValue(cl.incrementByOne(count.getCurrentValue()));
		
		System.out.println(count);
		count.setCurrentValue(cl.incrementByOne(count.getCurrentValue()));
		
		System.out.println(count);
		count.setCurrentValue(cl.incrementByOne(count.getCurrentValue()));
		
		System.out.println(count);
		count.setCurrentValue(cl.incrementByOne(count.getCurrentValue()));
		System.out.println(count);
		
	}

}

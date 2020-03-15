package by.htp.katokoleg.simleclassandobject.task6;

public class Main {

	public static void main(String[] args) {
		
		int[] arrayTime = new int[3];
		
		Time time = new Time(3,4,1);
		Time addingTime = new Time (59,55,22);
		
		TimeLogic2 tm = new TimeLogic2();

		
		arrayTime = tm.addTime(time, addingTime);
		
		
		System.out.println("Hours " + arrayTime[0] + " Minutes " + arrayTime[1] + " Secund " + arrayTime[2]);
	}

}

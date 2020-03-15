/*package by.htp.katokoleg.simleclassandobject.task6;

public class TimeLogic {
	
	public int convertTimeIntoSecund (Time time) {
		int sumTimeInSecund;
		int[] array = new int[3];
		
		array[0] = time.getHours();
		array[1] = time.getMinutes();
		array[2] = time.getSecund();
		
		sumTimeInSecund = array[0] * 3600 + array[1] * 60 + array[2];
		return sumTimeInSecund ;
	}
	
	public int addTime (int time1, int time2) {
		int sumTime = time1 + time2;
		
		if (sumTime > 86400) {
			sumTime %= 86400;
			return sumTime; 
		}
		return sumTime; 
	}
	
	public int[] transferTimeFromSecundIntoHourMinSec (int sumTime) {
		int sec;
		int time_in_min;
		int min;
		int hours;
		int[] timeArray = new int[3];
		
		sec = sumTime % 60;
		
		time_in_min = (sumTime - sec) / 60;
		
		min = time_in_min % 60;
		
		hours = (time_in_min - min) / 60;
		
		timeArray[0] = hours;
		timeArray[1] = min;
		timeArray[2] = sec;
		
		return timeArray;
	}


}*/

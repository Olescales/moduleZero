package by.htp.katokoleg.simpleclassandobject.task10;

public class Main {

	public static void main(String[] args) {

		Airline[] airlines = new Airline[8];

		Airline airline1 = new Airline("Prague", 102, "Boeing", "20:00", "monday/tuesday/saturday");
		Airline airline2 = new Airline("NewYork", 103, "Boeing", "16:00", "monday/wednesday/saturday");
		Airline airline3 = new Airline("Tallinn", 104, "Boeing", "17:00", "monday/thursday/saturday");
		Airline airline4 = new Airline("Beijing", 105, "Boeing", "16:00", "monday/wednesday/sunday");
		Airline airline5 = new Airline("Tokyo", 106, "Boeing", "15:00", "monday/tuesday/saturday");
		Airline airline6 = new Airline("Berlin", 107, "Boeing", "14:00", "monday/wednesday/friday");
		Airline airline7 = new Airline("Paris", 108, "Boeing", "13:00", "wednesday/sunday");
		Airline airline8 = new Airline("Kiev", 109, "Boeing", "12:00", "monday/thursday/sunday");

		airlines[0] = airline1;
		airlines[1] = airline2;
		airlines[2] = airline3;
		airlines[3] = airline4;
		airlines[4] = airline5;
		airlines[5] = airline6;
		airlines[6] = airline7;
		airlines[7] = airline8;

		Airport airport = new Airport(airlines);
		Airline[] air = new Airline[airlines.length];
		  air = airport.outputListFlightsDestination(airlines);
		  for (Airline a: air) {
		  System.out.println(a); }
		 
 
		
		Airline[] air1 = new Airline[airlines.length];

		air1 = airport.outputListFlightsDefDay(airlines);
		for (Airline a : air1) {
			System.out.println(a);
		}

		
		Airline[] air2 = new Airline[air1.length];

		air2 = airport.outputListFlightsDefDayDefTime(air1);
		for (Airline a : air2) {
			System.out.println(a);
		}
	}
}

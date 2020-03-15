package by.htp.katokoleg.simpleclassandobject.task10;

import java.util.Arrays;
import java.util.Scanner;

public class Airport {

	private String location;
	private Airline[] airlines;

	public Airport() {

	}

	public Airport(Airline[] airlines) {
		this.airlines = airlines;
		this.location = "Minsk";
	}

	public Airline[] outputListFlightsDestination(Airline[] airlines) {

		Airline[] listFlights = new Airline[airlines.length];

		System.out.println("Enter destination: ");
		Scanner in = new Scanner(System.in);
		String dest = in.next();

		int n = 0;
		for (int i = 0; i < airlines.length; i++) {
			if (airlines[i].getDestination().equalsIgnoreCase(dest)) {
				listFlights[n] = airlines[i];
			}
		}
		return listFlights;
	}

	public Airline[] outputListFlightsDefDay(Airline[] airlines) {

		Airline[] listFlightsDefDay = new Airline[airlines.length];

		System.out.println("Enter day: ");
		Scanner in = new Scanner(System.in);
		String days = in.next();
		String[] tokens = new String[3];

		int n = 0;
		for (int i = 0; i < airlines.length; i++) {
			tokens = airlines[i].getDaysOfFly().split("/");
			for (int j = 0; j < tokens.length; j++) {
				if (tokens[j].equalsIgnoreCase(days)) {
					listFlightsDefDay[n] = airlines[i];
					n++;
				}
			}
		}
		return listFlightsDefDay;
	}

	public Airline[] outputListFlightsDefDayDefTime(Airline[] listFlightsDefDay) {

		Airline[] listFlightsDefDayDefTime = new Airline[listFlightsDefDay.length];

		System.out.println("Enter min. appropriate time: ");
		Scanner in = new Scanner(System.in);
		String time = in.next();
		System.out.println(time);

		int n = 0;
		int m = 0;

		while (listFlightsDefDay[m] != null) {
			if (listFlightsDefDay[m].getDepartureTime().compareToIgnoreCase(time) > 0) {
				listFlightsDefDayDefTime[n] = listFlightsDefDay[m];
				n++;
			}
			m++;
		}
		return listFlightsDefDayDefTime;
	}
}

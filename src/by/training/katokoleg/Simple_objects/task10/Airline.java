package by.htp.katokoleg.simpleclassandobject.task10;

public class Airline implements Comparable<Airline> {

	private String destination;
	private int numberFlight;
	private String airplaneType;
	private String departureTime;
	private String daysOfFly;

	public Airline() {
		this.destination = "Minsk";
		this.numberFlight = 001;
		this.airplaneType = "Boeing747";
		this.departureTime = "20:00";
		this.daysOfFly = "Saturday";
	}

	public Airline(String destination,int numberFlight, String airplaneType, String departureTime, String daysOfFly) {
		this.destination = destination;
		this.numberFlight = numberFlight;
		this.airplaneType = airplaneType;
		this.departureTime = departureTime;
		this.daysOfFly = daysOfFly;
	}

	public int getNumberFlight() {
		return numberFlight;
	}

	public String getDestination() {
		return destination;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getDaysOfFly() {
		return daysOfFly;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((daysOfFly == null) ? 0 : daysOfFly.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numberFlight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (daysOfFly == null) {
			if (other.daysOfFly != null)
				return false;
		} else if (!daysOfFly.equals(other.daysOfFly))
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numberFlight != other.numberFlight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numberFlight=" + numberFlight + ", airplaneType="
				+ airplaneType + ", departureTime=" + departureTime + ", daysOfFly=" + daysOfFly + "]";
	}

	@Override
	public int compareTo(Airline o) {
		return departureTime.compareTo(o.departureTime);
	}
	
	
}

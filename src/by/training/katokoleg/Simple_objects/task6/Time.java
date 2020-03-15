package by.htp.katokoleg.simleclassandobject.task6;

public class Time {

	private int secund;
	private int minutes;
	private int hours;
	
	public Time() {
		this.secund = 0;
		this.minutes = 0;
		this.hours = 0;
	}
	
	public Time(int secund, int minutes, int hours) {
		this.secund = secund;
		this.minutes = minutes;
		this.hours = hours;
	}

	public int getSecund() {
		return secund;
	}

	public void setSecund(int secund) {
		if (secund >= 0 | secund <= 59) {
		this.secund = secund;
		}
		else {
			this.secund = 0;
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		if (minutes >= 0 | minutes <= 59) {
			this.minutes = minutes;
			}
			else {
				this.minutes = 0;
			}
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours >= 0 | hours<= 23) {
			this.hours = hours;
			}
			else {
				this.hours= 0;
			}
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Time [secund=" + secund + ", minutes=" + minutes + ", hours=" + hours + "]";
	}
	
	
}

package by.htp.katokoleg.simpleclassandobject.task5;

public class Counter {

	private int currentValue;
	private static int minValue = 0;
	private static int maxValue = 9;

	public Counter() {
		this.currentValue = 0;

	}

	public Counter(int currentValue) {
		this.currentValue = currentValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		if (currentValue >= minValue && currentValue <= maxValue) {
			this.currentValue = currentValue;
		} else if (currentValue < minValue ) {
			this.currentValue = 9;
		} else if (currentValue > minValue ) {
			this.currentValue = 0;
		}
	}

	public int getMinValue() {
		return minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	@Override
	public String toString() {
		return "Counter [currentValue=" + currentValue + "]";
	}

}

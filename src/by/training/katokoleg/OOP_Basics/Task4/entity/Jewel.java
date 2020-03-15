package by.htp.task1.entity;

public class Jewel {

	private String jewelsName;
	private double jewejsCost;
	
	public Jewel() {
		
	}
	
	public Jewel(String jewelsName, double jewejsCost) {
		this.jewelsName = jewelsName;
		this.jewejsCost = jewejsCost;
	}

	public String getJewelsName() {
		return jewelsName;
	}

	public void setJewelsName(String jewelsName) {
		this.jewelsName = jewelsName;
	}

	public double getJewejsCost() {
		return jewejsCost;
	}

	public void setJewejsCost(double jewejsCost) {
		this.jewejsCost = jewejsCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(jewejsCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((jewelsName == null) ? 0 : jewelsName.hashCode());
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
		Jewel other = (Jewel) obj;
		if (Double.doubleToLongBits(jewejsCost) != Double.doubleToLongBits(other.jewejsCost))
			return false;
		if (jewelsName == null) {
			if (other.jewelsName != null)
				return false;
		} else if (!jewelsName.equals(other.jewelsName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [jewelsName=" + jewelsName + ", jewejsCost=" + jewejsCost + "]\n";
	}
	
	
}

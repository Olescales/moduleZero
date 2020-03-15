package by.htp.katokoleg.simpleclassandobject.task3;

import java.util.Arrays;

public class Student {

	private String surnameAndInitials;
	private int groupNumber;
	private int[] marks = new int[5];
	
	public Student (String surnameAndInitials, int groupNumber, int[] marks) {
		
		this.surnameAndInitials = surnameAndInitials;
		this.groupNumber = groupNumber;
		this.marks = marks;
		
	}
	
	public void setSurnameAndInitials ( String surnameAndInitials) {
		this.surnameAndInitials = surnameAndInitials;
	}
	
	public String getSurnameAndInitials () {
		return surnameAndInitials;
	}
	
	public void setGroupNumber( int groupNumber) {
		this.groupNumber = groupNumber;
	}
	
	public int getGroupNumber() {
		return groupNumber;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [surnameAndInitials=" + surnameAndInitials + ", groupNumber=" + groupNumber + ", marks="
				+ Arrays.toString(marks) + "]\n";
	}
	
}

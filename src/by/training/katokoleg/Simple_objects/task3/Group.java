package by.htp.katokoleg.simpleclassandobject.task3;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	private List<Student> students; 
	private int groupSize;// создаем ограничение на группу
	
	public Group(int groupSize) {
		this.groupSize = groupSize;
		students = new ArrayList<Student>(groupSize);
	}
	
	public boolean add(Student st) {
		if (students.size() > groupSize ) {
			return false;
		}
		students.add(st);
		return true;
	}
	
	public void remove (Student st) {
		students.remove(st);
	}

	public List<Student> getStudents() {
		return students;
	}

	public int getGroupSize() {
		return groupSize;
	}

	@Override
	public String toString() {
		return "Group [students=" + students + "]";
	} 
	
}

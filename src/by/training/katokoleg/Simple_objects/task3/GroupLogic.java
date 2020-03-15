package by.htp.katokoleg.simpleclassandobject.task3;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {

	private StudentLogic studentLogic;
	
	public GroupLogic(StudentLogic studentLogic) {
		this.studentLogic = studentLogic;
	}
	
	public List<Student> takeALevelStudent (Group group) {
		List<Student> students;
		List<Student> aStudentList = new ArrayList<Student>();
		
		students = group.getStudents();
		
		for (Student st : students) {
			if (studentLogic.isALevelStudent(st)) {
				aStudentList.add(st);
			}
		}
		return aStudentList;
	}
	

	@Override
	public String toString() {
		return "GroupLogic [studentLogic=" + studentLogic + "]";
	}
	
}

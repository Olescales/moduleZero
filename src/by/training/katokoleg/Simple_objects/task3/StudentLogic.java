package by.htp.katokoleg.simpleclassandobject.task3;

public class StudentLogic {

	public boolean isALevelStudent(Student student) {
		int[] marks = student.getMarks();

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 9) {
				return false;
			}
		}
		return true;
	}

}

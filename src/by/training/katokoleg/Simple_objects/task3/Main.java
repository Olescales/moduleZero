package by.htp.katokoleg.simpleclassandobject.task3;

public class Main {

	public static void main(String[] args) {
		
		Student st0 = new Student("Oleg",12, new int [] {9,9,9,10,9});  
		Student st1 = new Student("Kolia",12, new int [] {8,9,9,10,5}); 
		Student st2 = new Student("Petia",9, new int [] {9,9,9,10,9}); 
		Student st3 = new Student("Galia",12, new int [] {8,9,9,10,5}); 
		Student st4 = new Student("Sonia",10, new int [] {8,6,9,10,5}); 
		Student st5 = new Student("Alex",12, new int [] {8,9,6,10,5}); 
		Student st6 = new Student("Bred",9, new int [] {8,9,9,10,5}); 
		Student st7 = new Student("Dert",9, new int [] {8,3,9,10,5}); 
		Student st8 = new Student("Kibn",12, new int [] {10,10,10,10,10}); 
		Student st9 = new Student("Qwerty",14, new int [] {8,9,9,10,5}); 
		
		StudentLogic logic = new StudentLogic();
		GroupLogic grLogic = new GroupLogic(logic);

		Group gr = new Group (10);
		
		gr.add(st0);
		gr.add(st1);
		gr.add(st2);
		gr.add(st3);
		gr.add(st4);
		gr.add(st5);
		gr.add(st6);
		gr.add(st7);
		gr.add(st8);
		gr.add(st9);
		
		
		System.out.println(gr.getStudents());
		System.out.println(grLogic.takeALevelStudent(gr));
	}

}

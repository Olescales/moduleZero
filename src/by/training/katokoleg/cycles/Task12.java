package by.htp.katokoleg.cycles.main;

public class Task12 {

	public static void main(String[] args) {
		
		int i;
		int an = 1;
		int sum = 0;
		
		for (i = 1; i < 11; i++) {
			sum += an;
			System.out.print(i + " ");
			System.out.println(sum);
			an += 6; 
		}
		

	}

}

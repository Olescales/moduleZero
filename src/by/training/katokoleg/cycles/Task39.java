package by.htp.katokoleg.cycles.main;

public class Task39 {

	public static void main(String[] args) {
		
		int threeDigital;
		int residue;
		
		for (int i = 10; i <=100; i++) {
			threeDigital = i * 7;
			residue = threeDigital % 100;
			if (residue == i) {
				System.out.println("Answer is: " + threeDigital);
			}
		}
		

	}

}

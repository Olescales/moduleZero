package by.htp.katokoleg.cycles.main;

public class Task10 {
	public static void main(String[] args) {

		int mult;
		double sum = 1;

		for (int i = 1; i < 201; i++) {
			mult = i;
			mult *= mult;
			sum *= mult;
			System.out.print(i);
			System.out.println("    " + sum);
		}

	}
}

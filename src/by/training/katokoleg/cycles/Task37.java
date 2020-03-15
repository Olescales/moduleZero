package by.htp.katokoleg.cycles.main;

public class Task37 {

	public static void main(String[] args) {
		
		int fourdigital;
		int fourdigitalConversely;

		for (int i = 10; i < 100; i++) {
			for (int j = 10; j < 100; j++) {
				fourdigital = i * 100 + j;
				fourdigitalConversely = j * 100 + i;
				if (fourdigital % 99 == 0 & fourdigitalConversely % 49 == 0) {
					System.out.println("First number: " + i);
					System.out.println("Second number:" + j);
					System.out.println("---------------------------");

				}
			}
		}

	}

}

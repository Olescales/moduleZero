package by.htp.katokoleg.array2.main;

public class Task5 {

	public static void main(String[] args) {

		int[] array = { 18, 4, 5, 87, 104, 34, 3, 456, 598, 2 ,56, 57, 57, 57 };
		int temp;

		for (int i = 0; i < array.length; i++) {
			temp = array[i];
			int j = i - 1;
			for (; j >= 0; j--) {
				if (temp < array[j]) {
					array[j + 1] = array[j];
				} else {
					break;
				}
			}
			array[j + 1] = temp;
		}

		for (int i : array) {
			System.out.print(i + "  ");
		}
	}
}

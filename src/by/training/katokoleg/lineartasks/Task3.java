package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int x;
		int y;
		
		int z;
		
		x = enterSilable("enter x: ");
		y = enterSilable("enter y: ");
		
		z = 2 * x + ( y -2 ) * 5;
		System.out.print("z = " + z);
	}
	public static int enterSilable(String message) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		x = sc.nextInt();
		return x; 
	}


}

package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task32 {
	
	public static void main(String[] args) {
		long m = (long) (Math.random() * 24);
		long n = (long) (Math.random() * 60);
		long k = (long) (Math.random() * 60);
		
		System.out.println("Time on board: " + m +" hours " + n + " minutes " + k + " seconds");
		
		long mnk = m * 60 * 60 + n * 60 + k;
				
		long p;
		long g;
		long r;
				
		System.out.println("Let,s add some.");
		
		p = enterNumber ("Enter hours: ");
		g = enterNumber ("Enter minutes: ");
		r = enterNumber ("Enter seconds: ");

		long pgr = p * 3600 + g * 60 + r;
		
		long sumtime = mnk + pgr;
		
		if (sumtime >= 86400) {
			sumtime = sumtime % 86400;
			
			System.out.println(sumtime);
			
			long sec = sumtime % 60;
					
			long time_in_min = (sumtime - sec) / 60;
			
			long min = time_in_min % 60;
			
			long hours = (time_in_min - min) / 60;
			
			System.out.print("Result will be: " + hours + "hours " + min + " min " + sec + " seconds");	
		}
		
		else {
			
			System.out.println(sumtime);
			
			long sec = sumtime % 60;
					
			long time_in_min = (sumtime - sec) / 60;
			
			long min = time_in_min % 60;
			
			long hours = (time_in_min - min) / 60;
			
			System.out.print("Result will be: " + hours + "hours " + min + " min " + sec + " seconds");	
		}
	}
	
	
	
	public static long enterNumber(String message) {

		long x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextLong()) {
			String S;
			S = sc.next();
			System.out.println("You entered wrong number: " + S);
			System.out.println("Enter number: ");
		}
		x = sc.nextLong();

		return x;
	}
}

package by.htp.task1.main;

import java.util.Scanner;

import by.htp.task1.controller.JewelController;

public class Main {

	public static void main(String[] args) {

		JewelController jl = new JewelController();
		
		System.out.println("Hi! Choose : 1 - see most expensive jewel or 2 - see all jewels");
		
		Scanner sc = new Scanner(System.in);
		String choose;
		choose = sc.next();
		
		String respond;
		
		System.out.println(respond = jl.doAction(choose));	 
		

	}

}

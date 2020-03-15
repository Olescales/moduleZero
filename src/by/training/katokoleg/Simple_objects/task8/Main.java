package by.htp.katokoleg.simleclassandobject.task8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		
		
		Customer[] customers = new Customer[6];

		Customer cus2 = new Customer(123,"Katok", "Oleg", "Olegovich", 1131_2222_3333_4444l, 124567891123l);
		Customer cus3 = new Customer(234,"Katog", "Aasiliy", "Olegovich", 1121_3222_3663_4444l, 124565891123l);
		Customer cus4 = new Customer(345,"Vilat", "Uriy", "Gregovich", 1411_2222_3333_4444l, 124567891123l);
		Customer cus5 = new Customer(1245,"Panasiuk", "Oleg", "Alexagovich", 1117_8222_3333_4444l, 1245675641123l);
		Customer cus6 = new Customer(356,"Zheltok", "Igor", "Olesich", 1411_2298_7333_4444l, 124567891123l);
		Customer cus7 = new Customer(4496,"Asderw", "Nikolay", "Olsgovich", 1111_7722_6633_4444l, 124567897612123l);

		customers[0] = cus2;
		customers[1] = cus3;
		customers[2] = cus4;
		customers[3] = cus5;
		customers[4] = cus6;
		customers[5] = cus7;
		
		CustomersClub cc = new CustomersClub(customers);
		cc.sortByABC(customers);
		
		for (Customer c : customers) {
			System.out.println(c);
		}
		System.out.println("===================================================================================");

		Customer[] sortByIdCardArray = new Customer[6];
		sortByIdCardArray = cc.sortByIdCard(customers);
		
		for (Customer d : sortByIdCardArray) {
			System.out.println(d);
		}
	}

	
}

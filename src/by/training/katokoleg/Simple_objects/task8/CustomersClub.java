package by.htp.katokoleg.simleclassandobject.task8;

import java.util.Arrays;

public class CustomersClub {

	private Customer[] customers;

	public CustomersClub(Customer[] customers) {
		this.customers = customers;
	}

	public Customer[] getCustomers() {
		return customers;
	}

	public void sortByABC(Customer[] customers) {

		int l = customers.length;
		String[] sortABC = new String[l];

		for (int i = 0; i < customers.length; i++) {
			sortABC[i] = customers[i].getName();
		}
		Arrays.sort(sortABC);

		for (int i = 0; i < customers.length; i++) {
			for (int j = i; j < customers.length; j++) {
				if (sortABC[i] == customers[j].getName()) {

					Customer t = customers[j];
					customers[j] = customers[i];
					customers[i] = t;
				}
			}
		}
	}

	public Customer[] sortByIdCard(Customer[] customers) {

		
		Customer[] sortById = new Customer[customers.length];

		int n = 0;
		for (int i = 0; i < customers.length; i++) {
			if (customers[i].getCardId() <= 1112222233334444l & customers[i].getCardId() >= 1111222233334444l) {
				sortById[n] = customers[i];
				n++;
			} 
		}
		return sortById;				
	}

	@Override
	public String toString() {
		return "CustomersClub [customers=" + Arrays.toString(customers) + "]";
	}
	
	
	
}

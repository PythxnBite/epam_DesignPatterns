package com.epam.structural_patterns;

public class AdapterPatternDemo {
	public void demo() {

		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());

	}

}

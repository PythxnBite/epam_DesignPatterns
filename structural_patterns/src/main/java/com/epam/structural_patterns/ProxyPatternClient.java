package com.epam.structural_patterns;

public class ProxyPatternClient {

	public void demo() {
		OfficeInternetAccess access = new ProxyInternetAccess("Steve Jobs");
		access.grantInternetAccess();
	}
}

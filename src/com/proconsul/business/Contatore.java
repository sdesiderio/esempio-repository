package com.proconsul.business;

public class Contatore {
	
	//STATIC (di classe)
	private static int x;
	
	
	public void conta() {
		
		x = x + 1;
		System.out.println(x);
		
	}
	
	public static void contaNew() {
		
		x = x + 1;
		System.out.println(x);
		
		
	}
	
	
	
	

}

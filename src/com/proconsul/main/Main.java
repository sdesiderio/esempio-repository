package com.proconsul.main;

import com.proconsul.business.Contatore;

public class Main {

	public static void main(String[] args) {
		
		Contatore contatore1 = new Contatore();
		
		// STACK (allocazione e una deallocazione dopo l'esecuzione)
		contatore1.conta();
		
		Contatore contatore2 = new Contatore();
		
		// STACK (allocazione e una deallocazione dopo l'esecuzione)
		contatore2.conta();
		
		/*
		 *  MEMSPACE (allocazione solo la prima volta
		 *  e deallocazione  solo al termine dell'esecuzione
		 *  dell'intera applicazione, non ogni volta
		 *  al termine dell'esecuzione del metodo stesso
		 */
		

		Contatore.contaNew();
		
		Contatore.contaNew();
		

	}

}

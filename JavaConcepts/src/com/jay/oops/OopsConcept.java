package com.jay.oops;

import java.io.IOException;

public class OopsConcept {

	public static void main (String[] args) throws Exception {


//		Horse h1 = new Horse();
//		Animal a1 = h1;
//		Animal a2 = (Animal) h1;
//		a1.fun();
//		a2.fun();
//		
//		Animal a3 = new Horse();
//		a3.fun();
		
		Animal a4 = new Horse();
		((Horse)a4).fun();
		a4.fun();
		
		Animal a = new Animal();
		a.fun();
	}
}

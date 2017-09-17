package com.jay.threadconcept;

import java.util.TreeSet;

public class ThreadConcept {
	
	static TreeSet<Integer> set = new TreeSet<>();
	public static void main (String[] args) throws InterruptedException {
		
		Thread t1 = new Thread (new Runnable () {
			@Override
			public void run () {
			
				printPrimeNum(0, 50);
			}
		});
		
		Thread t2 = new Thread (new Runnable () {
			@Override
			public void run () {
			
				printPrimeNum(51, 100);
			}
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		displaySet();
	}
	
	/**
	 * @param start
	 * @param end
	 */
	static void printPrimeNum (int start, int end) {
		
		for (int i = start; i < end; i++) {
			int counter = 0;
			if (i < 2) 
				continue;
			for (int j = 2; j < i; j++) {
				
				if (i % j == 0) {
					counter++;
					break;
				}
			}
			if (counter == 0) {
//				System.out.println(i);
				
//				String str = Integer.toString(i);
				set.add(i);
			}
		}
//		System.out.println("Pause");
	}
	static void displaySet () {
		for (Integer str : set) {
			System.out.println(str);
		}
	}

}

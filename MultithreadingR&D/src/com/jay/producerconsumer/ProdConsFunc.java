package com.jay.producerconsumer;

import java.util.LinkedList;

public class ProdConsFunc {
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 5;
	
	public void producerFunc() throws InterruptedException {
		int value = 0;
		
		while (true) {
			
			synchronized(this) {
				while (list.size() == capacity)
					wait();
				list.add(value++);
				notify();
//				sleep(1000);
				
			}
		}
		
	}
	
	public void consumerFunc() throws InterruptedException {
		while(true) {
			synchronized(this) {
				while (list.size() == 0) 
					wait();
				int value = list.removeFirst();
				notify();
			}
		}
	}



}

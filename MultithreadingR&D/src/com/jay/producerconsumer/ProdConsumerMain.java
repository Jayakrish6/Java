package com.jay.producerconsumer;

public class ProdConsumerMain {
	public static void main (String[] args) {
		final ProdConsFunc pcFun = new ProdConsFunc();
		Thread prodThread = new Thread (new Runnable() {
			@Override
			public void run() {
				try {
					pcFun.producerFunc();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread consThread = new Thread (new Runnable() {
			@Override
			public void run () {
				try {
					pcFun.consumerFunc();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}

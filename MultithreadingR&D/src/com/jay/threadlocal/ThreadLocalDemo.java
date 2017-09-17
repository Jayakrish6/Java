package com.jay.threadlocal;

public class ThreadLocalDemo {

	public static void main(String[] argv) throws Exception {
		ThreadLocal localThread = new ThreadLocal();
		Object o = localThread.get();
		localThread.set(o);

	}
}

package com.jay;

import java.lang.reflect.Method;

public class ReflectionDemo {
	
	public static void main (String[] args) throws Exception {
		Class cls = Class.forName("com.jay.Test");
		Test t = (Test)cls.newInstance();
		
		Method m = cls.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
	}
}

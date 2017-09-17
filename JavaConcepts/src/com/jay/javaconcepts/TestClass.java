package com.jay.javaconcepts;

import java.io.IOException;

public class TestClass {
	static final int data;
	static {
		data = 10;
	}
//	 public TestClass() {
//		 data = 10;
//	 }
	
	public int findMax(int arr[])  {  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
//        System.out.println(object);
        return max;  
    }  
	
	TestClass object;
	public TestClass() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		object = (TestClass) Class.forName("com.jay.javaconcepts.TestClass").newInstance();
	}
	
//	int iCount;
//	
//	public TestClass() {
//		iCount = 15;
//	}
//
//	final void func() throws IOException {
//		iCount = 10;
//		System.out.println(iCount);
//	}
//	final void func(int item) throws Exception{
//		iCount = 10;
//		System.out.println(iCount);
//	}
	
}

package com.jay.javaconcepts;

import java.io.IOException;

public class TestDemo extends TestClass{

	public TestDemo() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	public int findMax(int arr[]) throws RuntimeException{  
        int max=arr[0];  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    } 
}

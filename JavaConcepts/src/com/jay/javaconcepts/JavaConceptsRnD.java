package com.jay.javaconcepts;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class JavaConceptsRnD {

	public static void main (String[] args) throws Exception {

		FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
		BufferedOutputStream bout=new BufferedOutputStream(fout);    
		String s="Welcome to javaTpoint ";
		String s1 = s.concat("Jayakrishna Mohapatra");
		byte b[]=s1.getBytes();    
		bout.write(b); 
		System.out.println(bout);
		bout.flush();    
		bout.close();    
		fout.close();    
		System.out.println("success");

		try{    
			FileInputStream fin=new FileInputStream("D:\\testout.txt");    
			BufferedInputStream bin=new BufferedInputStream(fin);    
			int i;    
			while((i=bin.read())!=-1){    
//				System.out.print((char)i);    
			}    
			bin.close();    
			fin.close();    
		}catch(Exception e){System.out.println(e);}    

		FileInputStream input1=new FileInputStream("D:\\testin.txt");    
		FileInputStream input2=new FileInputStream("D:\\testout.txt");    
		SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		int j;    
		while((j=inst.read())!=-1){    
			System.out.print((char)j);    
		}    
		inst.close();    
		input1.close();    
		input2.close();    

//				TestClass test = new TestClass();
//				int iValue = test.findMax(new int[]{1,3,4,2});

		//		AtomicInteger atomicInteger = new AtomicInteger(123);
		//
		//		int theValue = atomicInteger.get();

		//		TestDemo t1 = new TestDemo();
		//		int iValue2 = t1.findMax(new int[]{1,3,4,2});
		//		System.out.println(iValue);

		//		ArrayList<Integer> intList = new ArrayList<Integer>();
		//		intList.add(1); //autoboxing - primitive to object
		//		intList.add(2); //autoboxing
		//		      
		//		ThreadLocal<Integer> intLocal = new ThreadLocal<Integer>();
		//		intLocal.set(4); //autoboxing
		//
		//		int number = intList.get(1); // unboxing
		//		int local = intLocal.get(); // unboxing in Java
		//		
		//		System.out.println(number + " " + local);


	}

}

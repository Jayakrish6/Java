package com.jay.blockingqueue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class BlockingQueueDemo {

	public static void main(String[] args) { 

		ArrayList<String> arrobj = new ArrayList<String>();
		arrobj.add("Alive is awesome");
		arrobj.add("Love yourself");
		System.out.println("ArrayList object output :"+ arrobj);

		CopyOnWriteArrayList<String> coponwrtobj = 
				new CopyOnWriteArrayList<String>();
		coponwrtobj.add("Alive is awesome");  
		coponwrtobj.add("Love yourself"); 
		System.out.println("CopyOnWriteArrayList object output :"+ coponwrtobj);   
		
		
		CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
        threadSafeList.add("Java");
        threadSafeList.add("J2EE");
        threadSafeList.add("Collection");
      
        //add, remove operator is not supported by CopyOnWriteArrayList iterator
        Iterator<String> failSafeIterator = threadSafeList.iterator();
        while(failSafeIterator.hasNext()){
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", failSafeIterator.next());
//            failSafeIterator.remove(); //not supported in CopyOnWriteArrayList in Java
        }
        
        System.out.println("===============================================================");
        Integer i1 = 1000;
        Integer i2 = 1000;
        
        if (i1 != i2) {
        	System.out.println("Different Objects");
        }
        if (i1.equals(i2)) {
        	System.out.println("Meaningfully equals");
        }
        if (i1 == i2) {
        	System.out.println("Equal objects");
        }
        System.out.println(i1 + " " +i2);

	}

}

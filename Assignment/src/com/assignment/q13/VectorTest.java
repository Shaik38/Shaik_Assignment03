package com.assignment.q13;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String args[]){
		Vector<String> vector = new Vector<String>();
	        //adding elements to the end
		vector.add("Jai");
		vector.add("Mahesh");
		vector.add("Hemant");
		vector.add("Vishal");
	        System.out.println(vector);
	        //adding element at specified index
	        vector.add(2,"Naren");
	        System.out.println(vector);
	        //getting elements by index
	        System.out.println("Element at index 2 is: "+vector.get(2));
	        //getting first element
	        System.out.println("The first element of this vector is: "+vector.firstElement());
	        //getting last element
	        System.out.println("The last element of this vector is: "+vector.lastElement());
	        //how to check vector is empty or not
	        System.out.println("Is this vector empty: "+vector.isEmpty());
	  }

}

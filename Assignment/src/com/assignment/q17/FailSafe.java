package com.assignment.q17;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe {
	
	public static void main(String[] args){
	      ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
	      //Adding elements to map
	      map.put("Dell", 1);
	      map.put("IBM", 2);
	      //Getting an Iterator from map
	      Iterator<String> it = map.keySet().iterator();
	      while (it.hasNext()){
	      String key = (String) it.next();
	         System.out.println(key+" : "+map.get(key));
	         map.put("Google", 3);
	      }
	   }

}

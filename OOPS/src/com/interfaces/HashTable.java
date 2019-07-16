package com.interfaces;

import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> h=new Hashtable<Integer,String>();
		h.put(9, "shiraz");
		h.put(2, "Sumit");
		h.put(3, "Mahesh");
		h.put(5, "Aniket");
	
		System.out.println(h);

		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		h2= (Hashtable<Integer, String>) h.clone();
		System.out.println(h2);
		
		System.out.println(h2.get(1));
		
		
		Set s=h.entrySet();
		System.out.println(s);
		
		for(int i: h.keySet()){
			System.out.print(i+"="+h.get(i)+", ");
			
			
		}
		
		
		
	h2.clear();
		
	System.out.println(h2);
		
		
	}

}

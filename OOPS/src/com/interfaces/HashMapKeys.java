package com.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapKeys {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("mahesh", "Babu");
		hm.put("babu", "Babu");
		hm.put("nani", "Babu");
		hm.put("ramesh", "Babu");
		hm.put("satish", "Babu");
		System.out.println("initilaing map value"+hm);
		System.out.println("**************Array liked lis*******************************");
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Mahesh");
		arr.add("Sumit");
		arr.add("Shariff");
		System.out.println(" Array list  are "+arr);
		System.out.println(arr.get(2));
		
		System.out.println("**************************Program****************************");
		String s="write an arraylist Program";
	//System.out.println(s.charAt(2));
		String[] str=s.split(" ");
		String word="";
		for(int i=0;i<=str.length;i++);
		{
			
			
			System.out.println("fisrst word is "+str[3]);
		}
		
		
		

}
}
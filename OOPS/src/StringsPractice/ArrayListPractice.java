package StringsPractice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
	 ar.add("456");
	 ar.add("Shiraz");
	 ar.add("Ahmed");
	 ar.add(2,"Mahboob");
	 ar.add(4,"Shariff");
	 System.out.println("Size of first array List is:"+ar.size());
	 
	 ArrayList <String> ar1 = new ArrayList <String>();
	 
	 ar1.addAll(ar);
	 System.out.println("Second array list is:"+ar1.size());
	 
	 for (int i=0;i<=ar.size()-1;i++){
		 System.out.println("Printing all the list from 1st array:"+ar.get(i)); 
	 }
		
	ar.remove(3);
	System.out.println("Size of first array List after removal is:"+ar.size());
	for (int i=0;i<=ar.size()-1;i++){
		 System.out.println("Printing all the list from 1st array:"+ar.get(i)); 
	 }
	}

}

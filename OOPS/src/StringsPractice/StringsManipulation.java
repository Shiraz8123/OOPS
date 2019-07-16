package StringsPractice;

import java.io.IOException;

public class StringsManipulation extends Throwable{

	public static void main(String[] args) throws IOException{
		String s1="Hello welcome to automation";
		String s2="Shiraz";
		String s3= "    Ahmed     ";
		System.out.println("concation of two strings are:"+(s1+s2));
		System.out.println("**************************************");
		System.out.println("char at index"+s1.charAt(3));
		System.out.println("char at index"+s1.charAt(15));
		//System.out.println("char at index"+s1.charAt(-1));
		System.out.println("**************************************");
		System.out.println("index of the string"+s2.indexOf(0));
		//System.out.println("index of the string"+s2.indexOf(-1));
		System.out.println("index of the string"+s2.indexOf(8));
		System.out.println("**************************************");
		System.out.println("Length of the string" +s1.length());
		System.out.println("**************************************");
		
		System.out.println("Substring concept:"+s1.substring(0, 5));
		System.out.println("Substring concept:"+s1.substring(3));
		System.out.println("Substring concept:"+s1.substring(0, 15));
		System.out.println("**************************************");
		System.out.println("Trim:"+s3.trim());
		
		System.out.println("**************************************");
		
		System.out.println("concat function:" +s2.concat(s3));
		
		System.out.println("**************************************");
		
		System.out.println("comparision concept:"+s2.compareTo(s3));
		
		System.out.println("**************************************");
		
		System.out.println("replace concept" +s2.replaceAll("Shiraz", "Mahboob"));
		System.out.println("Value of s2: " +s2);
		System.out.println("**************************************");
		
		String split1[] =s1.split(" ");
		System.out.println("Size of the split" +split1.length );
		for(int i=0;i<split1.length;i++){
			System.out.println("After splitting :" +split1[i]);
		}
		
	}

}

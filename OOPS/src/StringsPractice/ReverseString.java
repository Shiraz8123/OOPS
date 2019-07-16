package StringsPractice;

public class ReverseString {

	public static void main(String[] args) {
		String ss= "Maheshbabu";
		int len=ss.length();
		String rev=" ";
		for(int i=len-1;i>=0;i--){
			rev = rev+ss.charAt(i);
			System.out.println("Reverse of the string is:"+rev);
		}
			System.out.println("Reverse of the string is:"+rev);
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			
			
		//String Buffer class
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		String s= "Seleniumtest";
			StringBuffer bf = new StringBuffer(s);
		System.out.println(bf.reverse());
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		//String Concatenation
		String s1 = "Selenium";
		String s2= "Selenium";
		String s3= s1+s2;
		System.out.println("Concatination of two string :" +s1);
		System.out.println("Concatination of two string :" +s2);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		
		// String Immutable
		String si=new String("selenium");
		si.concat("webdriver");
		System.out.println("Value of immutable="+si);	
		//StringBuffer is mutable
		StringBuffer sg=new StringBuffer("Selenium");
		sg.append("webdriver");
		System.out.println("Value of string buffer is"+sg);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		
		
		StringBuffer buffer=new StringBuffer("hello");  
        buffer.append("java");  
        System.out.println(buffer); 
		
		
		
		
	}

}

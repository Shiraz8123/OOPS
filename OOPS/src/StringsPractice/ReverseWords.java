package StringsPractice;

import java.util.regex.Pattern;

public class ReverseWords {

	public static void main(String[] args) {
		
		     /*String str = "Welcometotheworldof automation";
		      Pattern p = Pattern.compile("\\s");
		      System.out.println("The original string is: " + str);
		      String[] temp = p.split(str);
		      String rev = "";
		      for (int i = 0; i < temp.length; i++) {
		         if (i == temp.length - 1)
		            rev = temp[i] + rev;
		         else
		            rev = " " + temp[i] + rev;
		      }
		      System.out.println("The reversed string is: " + rev);*/
		      
		      
		      
		      
		      
		      
		      
		      
		     /* String str = "He is the one";
		      String temp = "";
		      String finalString = "";
		          for(int i =str.length()-1;i>=0;i--){
		              temp +=i!=0?str.charAt(i):str.charAt(i)+" ";
		              if(str.charAt(i) == ' '||i==0){
		                  for(int j=temp.length()-1;j>=0;j--){
		                      finalString += temp.charAt(j);
		                  }
		                  temp = "";
		              }
		          }
		              System.out.println(finalString);*/
		      
		      
		     /* String rev ="He is the one";
		              String str[] = rev.split(" ");
		              String finalStr="";
		                  for(int i = str.length-1; i>= 0 ;i--){
		                      finalStr += str[i]+" ";
		                  }
		                  System.out.println(finalStr);   
		              */
		              
		            
		                  /*String rev ="He is the one";
			              String str[] = rev.split(" ");
			              String finalStr="";
			                  for(int i = str.length-1; i>= 0 ;i--){
			                      finalStr = finalStr+ str[i]+" ";
			                  }
			                  System.out.println(finalStr);   */
		              
			                  String str="I_will_get_The_Offer_from_Top_Comapany";
			                  String spl[]=str.split("_");
			                  String temp=" ";
			                  for(int i=spl.length-1;i>=0;i--){
			                	  temp=temp+spl[i]+"_";
			                	 
			                  }
			                  System.out.println("Reverse of the string is :"+temp);
			                  temp.equalsIgnoreCase(str);
			                  System.out.println(str);
			                  
			                  
		      
		   }

	}



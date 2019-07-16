package StringsPractice;

import java.util.Arrays;

public class SmallestLargest {

	public static void main(String[] args) {
		int num[]={1,2,45,78,99,52};
		int smallest=num[0];
		int largest = num[0];
		
		for (int i=0;i<num.length;i++){
			if(num[i]>largest){
				largest=num[i];
			}
			else if(num[i]<smallest){
				smallest=num[i];
			}
		}
		
		
		
		System.out.println("Given string is:" +Arrays.toString(num));
		System.out.println("Large number is:" +largest);
		System.out.println("Small number is:" +smallest);
	}
}

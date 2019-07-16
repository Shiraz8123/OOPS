package StringsPractice;

public class Pattern {

	public static void main(String[] args) {
		int i=20;
        for(int j=0;j<=i/2;j++){
               for(int k=i/2;k>j;k--){
                     System.out.print(" ");
                     
               }
               for(int l=0;l<(j*2)+1;l++){
                     System.out.print("*");
               }
               System.out.println("");
               
        }
         


	}

}

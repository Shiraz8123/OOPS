package StringsPractice;

public class OccuranceinString {

	public static void main(String[] args) {
		
		String str = "ABAACBDD";
		char ch = 'C';

		System.out.println("Character " + ch + " occurs " + countOccurrences(str, ch) + " times.");
	}

	private static int countOccurrences(String str, char ch) {
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				counter++;
			}
		}

		return counter;
		
	
		
}
	}



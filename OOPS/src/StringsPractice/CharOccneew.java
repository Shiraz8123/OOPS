package StringsPractice;

public class CharOccneew {

	public static void main(String[] args) {
		String s = "AAABBBCCCC";
		int count = 0;
		String temp = "";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count=count+1;

				}

			}
			if (!temp.contains(String.valueOf(s.charAt(i)))) {
				if (count > 0) {
					System.out.print(s.charAt(i) + "" + count);
				
				temp = temp + s.charAt(i);
			}
				}
			
			count = 0;

		}

	}

}

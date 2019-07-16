package StringsPractice;

public class CharOccurance {

	public static void main(String[] args) {
		int count = 0, a = 0;
		String temp = "";
		String names = "Shiraz8123ahmed@gmail.com";
		System.out.println("Original string is :" + names);
		for (int i = 0; i < names.length(); i++) {
			for (int j = i + 1; j < names.length(); j++) {
				if (names.charAt(i) == (names.charAt(j))) {
					count = count + 1;
					a = a + 1;

				}
			}
			if (!temp.contains(String.valueOf(names.charAt(i)))) {

				if (count > 0) {
					System.out.println("Duplicate array string is: '" + names.charAt(i));

					temp = temp + names.charAt(i);
					System.out.println(
							"Total no of times the character occured in String:" + names.charAt(i) + " = " + (++count));
				}

			}

			count = 0;

		}
		if (a == 0) {
			System.out.println("No duplicate found");
		}

	}

}

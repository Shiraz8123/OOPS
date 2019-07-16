package StringsPractice;
public class DuplicateElement {

	public static void main(String[] args) {

		int count = 0, a = 0;
		String temp = new String();
		String names[] = { "java", "python", "Selenium", "C", "Selenium", "Selenium", "Selenium", "Selenium", "C",
				"C" };
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					count = count + 1;
					a = a + 1;

				}
			}
			if (!temp.contains(names[i])) {
				if (count > 0) {
					System.out.println("Duplicate array string is: '" + names[i] + "' and index is: " + i + " and ");

					temp = temp + names[i];
					System.out.println(++count);
				}

			}

			count = 0;

		}
		if (a == 0) {
			System.out.println("No duplicate found");
		}
	}

}

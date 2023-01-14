package challenge.day1;
/*Java Challenge (3/20)

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "

Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.

Since an empty string reads the same forward and backward, it is a palindrome.
*/

public class PalindromeOrNot {

	public static void main(String[] args) {
		stringOne();
		stringTwo();
		stringThree();

	}

	public static void stringOne() {

		String reverse = "";
		String str = "A man, a plan, a canal: Panama";
		String lowerCase = str.toLowerCase();
		String replaceAll = lowerCase.replaceAll("[^a-zA-Z0-9]", " ");
		String replaceAll2 = replaceAll.replaceAll("\\s", "");

		// String lowerCase = replaceAll2.toLowerCase();

		char[] cName = replaceAll2.toCharArray();

		// System.out.println(lowerCase);

		for (int i = cName.length - 1; i >= 0; i--) {
			reverse = reverse + cName[i];
		}

		if (replaceAll2.equalsIgnoreCase(reverse)) {

			System.out.println(replaceAll2.equalsIgnoreCase(reverse));

		}

		else {
			System.out.println(replaceAll2.equalsIgnoreCase(reverse));
		}

	}

	public static void stringTwo() {

		String reverse = "";
		String str = "race a car";
		String lowerCase = str.toLowerCase();
		// String replaceAll = lowerCase.replaceAll("[^a-zA-Z0-9]", " ");
		String replaceAll2 = lowerCase.replaceAll("\\s", "");

		// String lowerCase = replaceAll2.toLowerCase();

		char[] cName = replaceAll2.toCharArray();

		// System.out.println(lowerCase);

		for (int i = cName.length - 1; i >= 0; i--) {
			reverse = reverse + cName[i];
		}

		if (replaceAll2.equalsIgnoreCase(reverse)) {

			System.out.println(replaceAll2.equalsIgnoreCase(reverse));

		}

		else {
			System.out.println(replaceAll2.equalsIgnoreCase(reverse));
		}
	}

	public static void stringThree() {

		String reverse = "";
		String str = " ";
		// String lowerCase = str.toLowerCase();
		// String replaceAll = lowerCase.replaceAll("[^a-zA-Z0-9]", " ");
		String replaceAll2 = str.replaceAll("\\s", "");

		// String lowerCase = replaceAll2.toLowerCase();

		char[] cName = replaceAll2.toCharArray();

		// System.out.println(lowerCase);

		for (int i = cName.length - 1; i >= 0; i--) {
			reverse = reverse + cName[i];
		}

		if (replaceAll2.equalsIgnoreCase(reverse)) {

			System.out.println(replaceAll2.equalsIgnoreCase(reverse));

		}

		else {
			System.out.println(replaceAll2.equalsIgnoreCase(reverse));
		}

	}

}

package challenge.day1;

/*
 * Java Challenge (1/20)
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1:
Input: s = "Hello World"
Output: 5

Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */

public class LengthOfLastWordInTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lengthOne();
		lengthTwo();
		lengthThree();
	}

	public static void lengthOne() {
		String strone = "Hello World";
		String[] split = strone.split(" ");

//		for(String s:split) {
//			System.out.println(s);
//		}

		String string = split[0];

		System.out.println("last string.." + string);

		int length = string.length();
		System.out.println("last string length.." + length);
	}

	public static void lengthTwo() {
		String strone = "   fly me   to   the moon  ";
		String strtrim = strone.trim();
		String[] split = strtrim.split(" ");
		
		//for loop for counting the number of string array items present on the given words

//		for(String s:split) {
//			System.out.println(s);
//		}

		String string = split[8];

		System.out.println("last string.." + string);

		int length = string.length();
		System.out.println("last string length.." + length);
	}

	public static void lengthThree() {
		String strone = "luffy is still joyboy";
		String[] split = strone.split(" ");

//		for(String s:split) {
//			System.out.println(s);
//		}

		String string = split[3];

		System.out.println("last string.." + string);

		int length = string.length();
		System.out.println("last string length.." + length);
	}

}

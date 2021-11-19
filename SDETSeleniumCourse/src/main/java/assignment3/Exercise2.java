package assignment3;


public class Exercise2 {

	public static void main(String[] args) {
		// Exercise 2: check if a given String is Palindrome or not
				String textString = "trurt";
				String reverseWord = "";
				char[] arrChar = textString.toCharArray();
				for (int l = arrChar.length - 1; l >= 0; l--) {
					reverseWord += arrChar[l];
				}
				if (textString.equals(reverseWord)) {
					System.out.println("Its Palindrome: True");
				} else {
					System.out.println("Its Palindrome: False");
				}
	}
}

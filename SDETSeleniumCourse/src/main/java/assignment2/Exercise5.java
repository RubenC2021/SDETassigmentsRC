package assignment2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		// 5. Reverse a number 123
		Scanner sn = new Scanner(System.in);
				System.out.println("Exercise 5: Reverse a number");
				System.out.println("Digit a number greater or equal to 5 digits");
				String numberStr = sn.nextLine();
				String reverseOrder = "";

				if (numberStr.length() >= 5) {
					for (int k = numberStr.length() - 1; k >= 0; k--) {
						reverseOrder = reverseOrder + numberStr.charAt(k);
					}
					System.out.println("Number in reverse is  " + reverseOrder);
				} else {
					System.out.println("Type a number with more digits");
				}
    }

}

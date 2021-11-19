package assignment2;

import java.util.Scanner;

public class Exercise4 {
	//4. Find the sum of digits 
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

	System.out.println("Exercise 4: Find the sum of digits");
	int t = 0;
	System.out.println("Digit a number greater or equal to 5 digits");
	int n = sn.nextInt();
	int dimension = Integer.toString(n).length();
	if (dimension >= 5) {
		for (int k = 0; k < dimension; k++) {
			String num = String.valueOf(Integer.toString(n).charAt(k));
			t += Integer.parseInt(num);
		}
		System.out.println("Sum of digit  " + n + " is  " + t);
	} else {
		System.out.println("Type a number with more digits");
	}
	}
}

package assignment3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		try {
			int num = 0;
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter a number: ");
			num = Integer.parseInt(reader.next());
			reader.close();
		} catch (NumberFormatException ex) {
			System.out.println("Incorrect value, its not a number");
		}
	}

}

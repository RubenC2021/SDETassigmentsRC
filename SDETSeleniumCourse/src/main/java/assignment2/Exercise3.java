package assignment2;

import java.util.Scanner;

public class Exercise3 {
	//3. Is 13 a prime number? 

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Exercise 3: Verify if a number is prime");
		boolean esPrimo = true;
		System.out.println("Digit any number");
		int number = sn.nextInt();
		esPrimo = isPrimeNumber(number);
		System.out.println("Is " + number + " a prime number ? " + esPrimo);
	}
	
	public static boolean isPrimeNumber(int number) {
		int counter = 2;
		boolean prime = true;
		while ((prime) && (counter != number)) {
			if (number % counter == 0)
				prime = false;
			counter++;
		}
		return prime;
	}
}

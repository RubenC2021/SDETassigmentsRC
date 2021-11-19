package assignment1;

import java.util.Scanner;

public class Exercise1 {

	// Write a program to calculate the factorial of a number using a while loop. 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number to get the factorial ");
		int num = scanner.nextInt();
		int numero1 = num;
		int factorial =1;
		
		while (num!=0) {
			factorial = factorial * num;
			num--;
		}
		
		System.out.println("Factorial Result for: "+ numero1 + " is: " + factorial);
		
		int factorial2 = 0;
		for (int i = numero1; i >=1; i--) {
			factorial2 = factorial2*i;
		}
		
		System.out.println("Factorial Result for "+ numero1 + " is: " + factorial);
	}
}

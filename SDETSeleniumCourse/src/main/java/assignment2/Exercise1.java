package assignment2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		// 1. Java Program to Calculate average of numbers using Array
				// Example: values[]= 1, 2,3 4, 5 average = 3 
				System.out.println("Exercise 1. Java Program to Calculate average of numbers using Array ");
				int[] numbers = new int[5];
				System.out.println("Lenght " + numbers.length);
				int total = 0, i;
				double promedio = 0;
				System.out.println("Enter 5 integers numbers");
				for (i = 0; i < numbers.length; i++) {
					System.out.println("Enter value " + (i + 1));
					numbers[i] = sn.nextInt();
					total += numbers[i];
					promedio = (double) total / numbers.length;

				}
				System.out.println("Average = " + promedio);
	
	
	}
}

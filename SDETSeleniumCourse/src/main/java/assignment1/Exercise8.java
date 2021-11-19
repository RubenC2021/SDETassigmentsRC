package assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise8 {

	/*Write a program to reverse the elements of an array where the array size as well as the
	array values are entered by the user.*/
	public static void main(String[] args) {
		int arraySize = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array: ");
		arraySize = sc.nextInt();
		Integer[] arrayElements = new Integer[arraySize];
		
		for(int i = 0; i < arraySize; i++) {
			System.out.println("Enter " + (i+1) + " element of the array: ");
			arrayElements[i] = sc.nextInt();
		}
		System.out.println("Unordered array: " + Arrays.toString(arrayElements));
		
		Arrays.sort(arrayElements, Collections.reverseOrder());
		System.out.println("Reversed array: " + Arrays.toString(arrayElements));
	}

}

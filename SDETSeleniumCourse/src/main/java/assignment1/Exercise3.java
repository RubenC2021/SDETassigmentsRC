package assignment1;

import java.util.Arrays;
import java.util.Collections;

public class Exercise3 {

	//4. Write a program to sort the elements of an array in ascending order. 
	public static void main(String[] args) {
		Integer[] numArray = {17,9,40,31,20,0,1,5,6};
		Arrays.sort(numArray,Collections.reverseOrder());
		System.out.println("Descending order: " + Arrays.toString(numArray));
		
		Arrays.sort(numArray);
		System.out.println("Ascending array: " + Arrays.toString(numArray));
	}

}

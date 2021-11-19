package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Exercise9 {

	//9. Write a program to print only even numbers till 50. 
	public static void main(String[] args) {
		//Using for Loop
		int min = 1, max = 50;
		List<Integer> numberList = new ArrayList<>();
		for (int j = min; j < max; j++) {
			if (min % 2 == 0) {
				numberList.add(j);
			}
			min++;
		}
		System.out.println("Odd numbers from 1 to 50 " + numberList);
		
		
		//Using while loop
		int counter = 1, i = 1;
		System.out.println("Using for Loop");
		while(counter <= 50) {
			if(i % 2 == 0) {
				System.out.print(i + " ,");
			}
			counter++;
			i++;
		}
	}
}

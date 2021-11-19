package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Exercise 2. Find all the odd numbers from 79 to 187");
		int min = 79, max = 187;
		List<Integer> numberList = new ArrayList<>();
		for (int j = min; j < max; j++) {
			if (min % 2 != 0) {
				numberList.add(min);
			}
			min++;
		}
		System.out.println("Odd numbers from 79 to 187 " + numberList);
	}

}

package assignment1;

public class Exercise7 {

	//Write a program to print the sum of the first 20 natural numbers. 
	public static void main(String[] args) {
		
		int counter = 1, sum = 0, i = 1;

		while (counter <= 20) {
			sum = sum + i;
			counter++;
			i++;
		}
		System.out.println("Sum is: " + sum);
	}

}

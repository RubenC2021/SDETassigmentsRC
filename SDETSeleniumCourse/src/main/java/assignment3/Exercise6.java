package assignment3;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        scanner.close();
        try {
           int result= num1/num2;
           System.out.println("Result is : "+result);
        } catch(ArithmeticException e) {
        	System.out.println("Not posibble to divide by zero");
            e.printStackTrace();
        }
        
	}
	

}

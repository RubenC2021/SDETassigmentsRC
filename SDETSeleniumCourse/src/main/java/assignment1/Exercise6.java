package assignment1;

import java.util.Scanner;

public class Exercise6 {

	// 6. Write a program to calculate the area of a triangle. Users will enter the
	// values for base and height of the triangle.
	public static void main(String[] args) {
		float base = 0, height = 0, area = 0;

		Scanner reader = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		base = sn.nextFloat();
		System.out.println("Enter the height of the rectangle");
		height = sn.nextFloat();
		area = (base * height) / 2;
		System.out.println("Area of the triangle is: " + area);
	}

}

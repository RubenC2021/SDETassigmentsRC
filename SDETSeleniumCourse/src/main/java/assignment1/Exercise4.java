package assignment1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//4. Write a program to check whether the current year is leap year or not. Users will
		//enter a year value. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a year to verify if is a leap year ");
		int year = scanner.nextInt();
		boolean leapYear=false;
		if ((year%4 ==0) && (year%100 !=0 || year%400==0)) {
			leapYear=true;
			System.out.println("Is a Leap year: " + leapYear);
			
		}
		else 
			System.out.println("Is a Leap year : "+ leapYear);
		
		//Using GregorianCalendar class
		GregorianCalendar calendar = new GregorianCalendar();
		if(calendar.isLeapYear(year)) {
			System.out.println("Using GregorianCalendar class: Is a Leap year: " + leapYear);
		}else {
			System.out.println("Using GregorianCalendar class: Is a Leap year: " + leapYear);
		}
	}
}

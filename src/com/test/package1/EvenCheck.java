package com.test.package1;
import java.util.Scanner;

public class EvenCheck {
	public static void main(String[] abc) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter a number: ");
		while (!userInput.hasNextInt()) {
			System.out.println("Please enter a numeric value: ");
			userInput.next();
		}
		checker(userInput);		
	}

	private static void checker(Scanner userInput) {
		int enteredNumber;
		enteredNumber = userInput.nextInt();
		if(enteredNumber % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Odd number");
		 }
	}
	
}

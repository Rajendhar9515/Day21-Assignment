package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationProblem {

	static Scanner input = new Scanner(System.in);

	// UC-1 :- As a User need to enter a valid First Name.
	public static void firstNameValidation() {
		System.out.println("Enter First Name");
		String firstName = input.nextLine();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", firstName);
		System.out.println(b);
	}

	public static void main(String[] args) {

		System.out.println("\t WELCOME TO USER REGISTRATION PROBLEM \n");

		firstNameValidation();
	}
}
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

	// UC-2 :- As a User need to enter a valid Last Name.
	public static void lastNameValidation() {
		System.out.println("Enter last Name");
		String lastName = input.nextLine();
		boolean b = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", lastName);
		System.out.println(b);
	}

	// UC-3:- As a User need to enter a valid email.
	public static void emailValidation() {
		System.out.println("Enter Email");
		String email = input.nextLine();
		boolean b = Pattern.matches("^(.+)@(\\S+)$", email);
		System.out.println(b);
	}

	public static void main(String[] args) {

		System.out.println("\t WELCOME TO USER REGISTRATION PROBLEM \n");

		firstNameValidation();
		lastNameValidation();
		emailValidation();
	}
}
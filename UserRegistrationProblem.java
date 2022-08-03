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

	// UC-4:- As a User need to follow predefined Mobile Format.
	public static void mobileNumberValidation() {
		System.out.println("Enter Mobile Number");
		String num = input.nextLine();
		boolean b = Pattern.matches("^[0-9]{2}[0-9]{10}", num);
		System.out.println(b);
	}

	// UC-6:- As a User need to follow pre-defined Password rules. Rule-2:- Should have at least 1 Upper Case.
	public static void passwordValidation() {
		System.out.println("Enter Password");
		String password = input.nextLine();
		boolean b = Pattern.matches("^(?=.*[A-Z])[A-Za-z0-9].{8,}$", password);
		System.out.println(b);
	}

	public static void main(String[] args) {

		System.out.println("\t WELCOME TO USER REGISTRATION PROBLEM \n");

		firstNameValidation();
		lastNameValidation();
		emailValidation();
		mobileNumberValidation();
		passwordValidation();
	}
}
package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistrationProblem uspTest;

	@Before
	public void classObject() {
		uspTest = new UserRegistrationProblem();
	}

	// UC-12 :- Refactor the Code to throw custom exceptions in case of Invalid User Details.

	@Test
	public void given_first_name_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.firstNameValidation("Rajendhar");
		assertEquals(true, output);
	}

	@Test
	public void given_first_name_expected_as_false() {
		try {
			boolean output = uspTest.firstNameValidation("rajendhar");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_last_name_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.lastNameValidation("Vemula");
		assertEquals(true, output);
	}

	@Test
	public void given_last_name_expected_as_false() {
		try {
			boolean output = uspTest.lastNameValidation("vemula");
			assertEquals(false, output);

		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_email__extpected_as_true() throws UserRegistrationException {
		boolean output = uspTest.emailValidation("vemula.rajendhar1@gmail.com");
		assertEquals(true, output);
	}

	@Test
	public void given_email__extpected_as_false() {
		try {
			boolean output = uspTest.emailValidation("vemula.rajendhar1@.gmail.com.com");
			assertEquals(true, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_mobile_number_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.mobileNumberValidation("91 8591234562");
		assertEquals(true, output);
	}

	@Test
	public void given_mobile_number_expected_as_false() {
		try {
			boolean output = uspTest.mobileNumberValidation("918591234562");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void given_password_expected_as_true() throws UserRegistrationException {
		boolean output = uspTest.passwordValidation("Rajendhar123@");
		assertEquals(true, output);
	}

	@Test
	public void given_password_expected_as_false() {
		try {
			boolean output = uspTest.passwordValidation("Rajendhar$l123@");
			assertEquals(false, output);
		} catch (UserRegistrationException ex) {
			ex.printStackTrace();
		}
	}
}
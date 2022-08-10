package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void given_first_name_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.firstNameValidation("Nikhil");
		assertEquals(true , output);
	}

	@Test
	public void given_first_name_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.firstNameValidation("nikhil");
		assertEquals(false , output);
	}
	
	@Test
	public void given_last_name_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.lastNameValidation("Sundarasetty");
		assertEquals(true , output);
	}
	
	@Test
	public void given_last_name_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.lastNameValidation("sundarasetty");
		assertEquals(false , output);
	}
	
	@Test
	public void given_email_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.emailValidation("nikhilnaidu473@gmail.com");
		assertEquals(true , output);
	}
	
	@Test
	public void given_email_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.emailValidation("nikhilnaidu473@.gmail.com");
		assertEquals(false , output);
	}
	
	@Test
	public void given_mobile_number_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.mobileNumberValidation("91 9398359637");
		assertEquals(true , output);
	}
	
	@Test
	public void given_mobile_number_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.mobileNumberValidation("919398359637");
		assertEquals(false , output);
	}
	
	@Test
	public void given_password_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.passwordValidation("Nikhil123@");
		assertEquals(true , output);
	}
	
	@Test
	public void given_password_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.passwordValidation("Nikhi$l123@");
		assertEquals(false , output);
	}
}
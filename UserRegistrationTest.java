package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void given_first_name_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.firstNameValidation("Rajendhar");
		assertEquals(true , output);
	}

	@Test
	public void given_first_name_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.firstNameValidation("rajendhar");
		assertEquals(false , output);
	}
	
	@Test
	public void given_last_name_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.lastNameValidation("Vemula");
		assertEquals(true , output);
	}
	
	@Test
	public void given_last_name_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.lastNameValidation("vemula");
		assertEquals(false , output);
	}
	
	@Test
	public void given_email_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.emailValidation("vemulrajendhar1@gmail.com");
		assertEquals(true , output);
	}
	
	@Test
	public void given_email_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.emailValidation("rajendhar@.gmail.com.com");
		assertEquals(false , output);
	}
	
	@Test
	public void given_mobile_number_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.mobileNumberValidation("91 4532324523");
		assertEquals(true , output);
	}
	
	@Test
	public void given_mobile_number_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.mobileNumberValidation("914532324523");
		assertEquals(false , output);
	}
	
	@Test
	public void given_password_expected_as_true() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.passwordValidation("Rajendhar12@");
		assertEquals(true , output);
	}
	
	@Test
	public void given_password_expected_as_false() {
		UserRegistrationProblem uspTest = new UserRegistrationProblem();
		boolean output = uspTest.passwordValidation("Raja$l123@");
		assertEquals(false , output);
	}
}

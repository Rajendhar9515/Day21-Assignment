package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
	UserRegistrationProblem uspTest;
	String inputs;
	boolean expectedResult;

	public UserRegistrationTest(String inputs, boolean expectedResult) {
		this.inputs = inputs;
		this.expectedResult = expectedResult;
	}

	@Before
	public void classObject() {
		uspTest = new UserRegistrationProblem();
	}

	@Parameters(name = "given_email_inputs_expected_boolean_outputs()")
	public static Collection given_email_inputs_expected_boolean_outputs() {
		return Arrays.asList(new Object[][] 
				{ { "abc@yahoo.com", true }, 
			    { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, 
				{ "abc111@abc.com", true }, 
				{ "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, 
				{ "abc@1.com", true }, 
				{ "abc@gmail.com.com", true },
				{ "abc+100@gmail.com.com", true }, 
				{ "abc+100@gmail.com", true }, 
				{ "abc@.com.com", false },
				{ "abc123@gmail.a", false }, 
				{ "abc123@.com", false }, 
				{ "abc123@.com.com", false },
				{ ".abc@abc.com", false }, 
				{ "abc()*@gmail.com", false }, 
				{ "abc@%*.com", false },
				{ "abc..2002@gmail.com", false }, 
				{ "abc.@gmail.com", false }, 
				{ "abc@abc@gmail.com", false },
				{ "abc@gmail.com.1a", false }, 
				{ "abc@gmail.com.aa.au^$", false } });
	}

	@Test
	public void given_parameterized_test_emails_extpected_as_boolean_output() {
		boolean output = uspTest.emailValidation(inputs);
		assertEquals(expectedResult, output);
	}

	@Test
	public void given_first_name_expected_as_true() {
		boolean output = uspTest.firstNameValidation("Nikhil");
		assertEquals(true, output);
	}

	@Test
	public void given_first_name_expected_as_false() {
		boolean output = uspTest.firstNameValidation("nikhil");
		assertEquals(false, output);
	}

	@Test
	public void given_last_name_expected_as_true() {
		boolean output = uspTest.lastNameValidation("Sundarasetty");
		assertEquals(true, output);
	}

	@Test
	public void given_last_name_expected_as_false() {
		boolean output = uspTest.lastNameValidation("sundarasetty");
		assertEquals(false, output);
	}

	@Test
	public void given_mobile_number_expected_as_true() {
		boolean output = uspTest.mobileNumberValidation("91 9398359637");
		assertEquals(true, output);
	}

	@Test
	public void given_mobile_number_expected_as_false() {
		boolean output = uspTest.mobileNumberValidation("919398359637");
		assertEquals(false, output);
	}

	@Test
	public void given_password_expected_as_true() {
		boolean output = uspTest.passwordValidation("Nikhil123@");
		assertEquals(true, output);
	}

	@Test
	public void given_password_expected_as_false() {
		boolean output = uspTest.passwordValidation("Nikhi$l123@");
		assertEquals(false, output);
	}
}
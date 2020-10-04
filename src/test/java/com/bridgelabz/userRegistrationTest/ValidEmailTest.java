package com.bridgelabz.userRegistrationTest;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class ValidEmailTest {
String email;
boolean expectedResult;

public ValidEmailTest(String email, boolean expectedResult)
{
	super();
	this.email=email;
	this.expectedResult=expectedResult;
}

@Parameterized.Parameters
public static Collection input()
{
	return Arrays.asList(new Object[][] {{"abc@yahoo.com",true}, {"abc-100@yahoo.com",true},
		{"abc.100@yahoo.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},
		{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},
		{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true},
		{"abc@.com.my",false},{"abc123@gmail.a",false},{"abc123@.com",false},
		{"abc123@.com.com",false},{".abc@abc.com",false},{"abc()*@gmail.com",false},
		{"abc@%*.com",false},{"abc..2002@gmail.com",false},{"abc.@gmail.com",false},
		{"abc@abc@gmail.com",false},{"abc@gmail.com.1a",false},{"abc@gmail.com.aa.au",false}});
}

@Test
public void testEmail() throws UserValidationException
{
	try {
	UserValidation validator = new UserValidation();
	boolean result = validator.emailCheck(this.email);
		Assert.assertEquals(this.expectedResult,result);
        } catch(UserValidationException e)
	{
	    Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID, e.exception);
	    Assert.assertEquals("enter proper email", e.getMessage());
	}
}

@Test
public void testEmail_null() throws UserValidationException
{
	try {
	UserValidation validator = new UserValidation();
	boolean result = validator.emailCheck(null);
	}catch(UserValidationException e)
	{
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_NULL, e.exception);
		Assert.assertEquals("enter proper email",e.getMessage());
	}



}

@Test
public void testEmail_empty() throws UserValidationException
{
	try {
	UserValidation validator = new UserValidation();
	boolean result = validator.emailCheck("");
	}catch(UserValidationException e)
	{
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_EMPTY, e.exception);
		Assert.assertEquals("enter proper email",e.getMessage());
	}



}
}
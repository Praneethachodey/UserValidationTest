package com.bridgelabz.userRegistrationTest;

public class UserValidationException extends Exception {
	exceptionType exception;

	enum exceptionType{
		ENTERED_EMPTY,ENTERED_NULL,ENTERED_INVALID;
	}
	
	public UserValidationException(exceptionType exception, String message)
	{
		super(message);
		this.exception=exception;
}
}


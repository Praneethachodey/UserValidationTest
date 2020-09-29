package com.bridgelabz.userRegistrationTest;
import java.util.regex.Pattern;

public class UserValidation {
	
	public boolean firstNameCheck(String firstName)
	{
		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
		return pattern.matcher(firstName).matches();
	}
	
	public boolean emailCheck(String email)
	{
		//String valid = new String("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]{2,})?(\\.[a-z]{2,})?$");
		String valid = new String("^[a-zA-Z0-9\\-_]+([\\.+_-][a-zA-Z0-9]+)?@([a-zA-Z0-9]+)\\.([a-z0-9]{2,})(\\.[a-z]{2})?$");
		Pattern pattern = Pattern.compile(valid);
		return pattern.matcher(email).matches();
	}
	
	public boolean phoneCheck(String mobile)
	{
		String valid = new String("[0-9]{2}( [0-9]{10})");
		Pattern pattern = Pattern.compile(valid);
		return pattern.matcher(mobile).matches();
				
	}
	
	public boolean passwordCheck(String password)
	{
		String valid = new String("(?=.*[A-Z])(?=.*[0-9]).{8,}");
		String valid1= new String("[a-z0-9A-Z]*[$&@#][a-z0-9A-Z]*");
		Pattern pattern = Pattern.compile(valid);
		Pattern pattern1 = Pattern.compile(valid1);
		return pattern.matcher(password).matches()&&pattern1.matcher(password).matches();
	}

}

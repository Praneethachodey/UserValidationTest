package com.bridgelabz.userRegistrationTest;
import java.util.regex.Pattern;



@FunctionalInterface
interface UserEntry{
	 boolean check(String entry) throws UserValidationException;
	 static boolean patternCheck(String field,String patternEntry,String fieldEntry) throws UserValidationException
	 {
		 String message="enter proper ";
		 if(fieldEntry.length()==0) throw new UserValidationException(UserValidationException.exceptionType.ENTERED_EMPTY,message.concat(field));
		    Pattern pattern = Pattern.compile(patternEntry);
			boolean result= pattern.matcher(fieldEntry).matches();
			if(!result) 
				throw new UserValidationException(UserValidationException.exceptionType.ENTERED_INVALID,message.concat(field));
			return result;
	 }
}
public class UserValidation {
	
	//public boolean firstNameCheck(String firstName) throws UserValidationException
	//{
	UserEntry user = (entry)->{	
	try {
//		if(entry.length()==0) 			
//			throw new UserValidationException(UserValidationException.exceptionType.ENTERED_EMPTY,"enter proper name");
//		Pattern pattern = Pattern.compile("[A-Z]{1}[a-z]{2,}");
//		boolean result= pattern.matcher(entry).matches();
//		if(!result) 
//			throw new UserValidationException(UserValidationException.exceptionType.ENTERED_INVALID,"enter proper name");
//	return result;
		String pattern = "[A-Z]{1}[a-z]{2,}";
		return UserEntry.patternCheck("name", pattern, entry);
	}catch(NullPointerException e)
		{
		throw new UserValidationException(UserValidationException.exceptionType.ENTERED_NULL,"enter proper name");
		} 
	};
	
	//public boolean emailCheck(String email) throws UserValidationException
	//{
	UserEntry emailCheck = (entry)->{	
		try {
			//if(email.length()==0) 			
				//throw new UserValidationException(UserValidationException.exceptionType.ENTERED_EMPTY,"enter proper email");
			//String valid = new String("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]{2,})?(\\.[a-z]{2,})?$");
		String valid = new String("^[a-zA-Z0-9\\-_]+([\\.+_-][a-zA-Z0-9]+)?@([a-zA-Z0-9]+)\\.([a-z0-9]{2,})(\\.[a-z]{2,})?$");
		//Pattern pattern = Pattern.compile(valid);
		//boolean result= pattern.matcher(email).matches();
		//if(!result)
			//throw new UserValidationException(UserValidationException.exceptionType.ENTERED_INVALID,"enter proper email");
		return UserEntry.patternCheck("email",valid,entry);
			}
		catch(NullPointerException e)
		{
		throw new UserValidationException(UserValidationException.exceptionType.ENTERED_NULL,"enter proper email");
		}
	};
	
	
	
	//public boolean phoneCheck(String mobile) throws UserValidationException
	//{
	UserEntry phoneCheck = (entry) ->{
		try {
			//if(mobile.length()==0) 			
				//throw new UserValidationException(UserValidationException.exceptionType.ENTERED_EMPTY,"enter proper phone number");
	    String valid = new String("[0-9]{2}( [0-9]{10})");
		//Pattern pattern = Pattern.compile(valid);
		//boolean result = pattern.matcher(mobile).matches();
		return UserEntry.patternCheck("phone number", valid, entry);
		}
	catch(NullPointerException e)
	{
	throw new UserValidationException(UserValidationException.exceptionType.ENTERED_NULL,"enter proper phone number");
	}
		
				
	};
	
	
	//public boolean passwordCheck(String password) throws UserValidationException
	//{
	UserEntry passwordCheck = (entry) ->
	{
		try {
			if(entry.length()==0) 			
				throw new UserValidationException(UserValidationException.exceptionType.ENTERED_EMPTY,"enter proper password");
	   
		String valid = new String("(?=.*[A-Z])(?=.*[0-9]).{8,}");
		String valid1= new String("[a-z0-9A-Z]*[$&@#][a-z0-9A-Z]*");
		Pattern pattern = Pattern.compile(valid);
		Pattern pattern1 = Pattern.compile(valid1);
		return pattern.matcher(entry).matches()&&pattern1.matcher(entry).matches();
	  }
		catch(NullPointerException e)
		{
		throw new UserValidationException(UserValidationException.exceptionType.ENTERED_NULL,"enter proper password");
		}
			
	};
}

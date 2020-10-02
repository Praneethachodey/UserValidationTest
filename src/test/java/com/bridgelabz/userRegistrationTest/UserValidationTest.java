package com.bridgelabz.userRegistrationTest;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class UserValidationTest 
{
	UserValidation user=null;
	
	@Before
    public void initialise()
    {
    	user = new UserValidation();
    }
	
	//given correct value
    @Test
    public void whenGivenFirstNameShouldReturnTrue() throws UserValidationException
    {
    	Assert.assertTrue(user.firstNameCheck("Praneetha"));
    }
     
    //given name of 3 letters
    @Test
    public void whenGivenFirstNameShouldReturnTrue1() throws UserValidationException
    {
    	Assert.assertTrue(user.firstNameCheck("Pra"));
    }
    
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse6() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.firstNameCheck(""));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_EMPTY,e.exception);

         }
    }
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse7() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.firstNameCheck(null));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_NULL,e.exception);

         }
    }
    
    //given all lower case 
    @Test
    public void whenGivenFirstNameShouldReturnFalse() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.firstNameCheck("praneetha"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given only 2 characters
    @Test
    public void whenGivenFirstNameShouldReturnFalse1() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.firstNameCheck("Pr"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given number in name
    @Test
    public void whenGivenFirstNameShouldReturnFalse2() throws UserValidationException
    {  
    	try {
    	Assert.assertFalse(user.firstNameCheck("Praneetha1"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given spl character in name
    @Test
    public void whenGivenFirstNameShouldReturnFalse4() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.firstNameCheck("Praneetha@"));
    }
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given all upper case
    @Test
    public void whenGivenFirstNameShouldReturnFalse5() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.firstNameCheck("PRANEETHA"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given correct name
    @Test
    public void whenGivenLastNameShouldReturnTrue() throws UserValidationException
    {
    	try {
    	Assert.assertTrue(user.firstNameCheck("Chodey"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given all lower case
    @Test
    public void whenGivenLastNameShouldReturnFalse() throws UserValidationException
    { 
    	try {
    	Assert.assertFalse(user.firstNameCheck("chodey"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    @Test
    public void whenGivenLastNameShouldReturnFalse5() throws UserValidationException
    { 
    	try {
    	Assert.assertFalse(user.firstNameCheck(""));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_EMPTY,e.exception);

         }
    }
    
    @Test
    public void whenGivenLastNameShouldReturnFalse6() throws UserValidationException
    { 
    	try {
    	Assert.assertFalse(user.firstNameCheck(null));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_NULL,e.exception);

         }
    }
    
    
    //given only 2 characters
    @Test
    public void whenGivenLastNameShouldReturnFalse1() throws UserValidationException
    {
    	
    	try{
    		Assert.assertFalse(user.firstNameCheck("Ch"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    	}
    
   
    //given special characters and numbers in name 
    @Test
    public void whenGivenLastNameShouldReturnFalse2() throws UserValidationException
    {
    	
    	try {
    	Assert.assertFalse(user.firstNameCheck("Chodey@555"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given uppercase only
    @Test
    public void whenGivenLastNameShouldReturnFalse4() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.firstNameCheck("CHODEY"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given correct number
    @Test
    public void whenGivenPhoneShouldReturnTrue() throws UserValidationException
    {
    	Assert.assertTrue(user.phoneCheck("91 9999999999"));
    	
    }
    
    //space not given
    @Test
    public void whenGivenPhoneShouldReturnFalse()
    {
    	try {
    	Assert.assertFalse(user.phoneCheck("919999999999"));
    }
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper phone number",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    @Test
    public void whenGivenPhoneShouldReturnFalse5()
    {
    	try {
    	Assert.assertFalse(user.phoneCheck(""));
    }
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper phone number",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_EMPTY,e.exception);

         }
    }
    
    @Test
    public void whenGivenPhoneShouldReturnFalse6()
    {
    	try {
    	Assert.assertFalse(user.phoneCheck(null));
    }
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper phone number",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_NULL,e.exception);

         }
    }
    	
    
    //only 9 numbers are given
    @Test
    public void whenGivenPhoneShouldReturnFalse1()
    {
    	try {
    	Assert.assertFalse(user.phoneCheck("91 999999999"));
    	}
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper phone number",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //characters given in number
    @Test
    public void whenGivenPhoneShouldReturnFalse2()
    {
    	try {
    	Assert.assertFalse(user.phoneCheck("99hee99999"));
    }
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper phone number",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //didnt give country code
    @Test
    public void whenGivenPhoneShouldReturnFalse3()
    {
    	try {
    	Assert.assertFalse(user.phoneCheck("9999999999"));
    }
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper phone number",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    //given more than 10 numbers
    @Test
    public void whenGivenPhoneShouldReturnFalse4()
    {
    	try {
    	Assert.assertFalse(user.phoneCheck("91 9999999999999999"));
    }
    	catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper phone number",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

         }
    }
    
    
    //gave correct password
    @Test
    public void whenGivenPasswordShouldReturnTrue() throws UserValidationException
    {
    	Assert.assertTrue(user.passwordCheck("Praneetha@5555"));
    }
    
    //didnt give number and uppercase
    @Test
    public void whenGivenPasswordShouldReturnFalse1()
    {
    	try {
    	Assert.assertFalse(user.passwordCheck("Pranee"));
    }catch(UserValidationException e)
    	{
		Assert.assertEquals("enter proper password",e.getMessage());
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

     }
}
    
    @Test
    public void whenGivenPasswordShouldReturnFalse6()
    {
    	try {
    	Assert.assertFalse(user.passwordCheck(""));
    }catch(UserValidationException e)
    	{
		Assert.assertEquals("enter proper password",e.getMessage());
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_EMPTY,e.exception);

     }
}
    
    @Test
    public void whenGivenPasswordShouldReturnFalse7()
    {
    	try {
    	Assert.assertFalse(user.passwordCheck(null));
    }catch(UserValidationException e)
    	{
		Assert.assertEquals("enter proper password",e.getMessage());
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_NULL,e.exception);

     }
}
    //no uppercase
    @Test
    public void whenGivenPasswordShouldReturnFalse2()
    {
    	try {
    	Assert.assertFalse(user.passwordCheck("praneetha@123"));
    }catch(UserValidationException e)
    	{
		Assert.assertEquals("enter proper password",e.getMessage());
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

     }
}
    
    //no number
    @Test
    public void whenGivenPasswordShouldReturnFalse3()
    {
    	try {
    	Assert.assertFalse(user.passwordCheck("Praneetha@"));
    }catch(UserValidationException e)
    	{
		Assert.assertEquals("enter proper password",e.getMessage());
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

     }
}
    
    //no special character
    @Test
    public void whenGivenPasswordShouldReturnFalse4()
    {
    	try {
    	Assert.assertFalse(user.passwordCheck("Praneetha5566"));
    }catch(UserValidationException e)
    	{
		Assert.assertEquals("enter proper password",e.getMessage());
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

     }
}
    
    //more than one special character
    @Test
    public void whenGivenPasswordShouldReturnFalse5()
    {
    	try {
    	Assert.assertFalse(user.passwordCheck("Praneetha@5566@"));
    }catch(UserValidationException e)
    	{
		Assert.assertEquals("enter proper password",e.getMessage());
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

     }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

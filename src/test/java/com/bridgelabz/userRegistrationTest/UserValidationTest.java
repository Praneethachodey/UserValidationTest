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
    	Assert.assertTrue(user.user.check("Praneetha"));
    }
     
    //given name of 3 letters
    @Test
    public void whenGivenFirstNameShouldReturnTrue1() throws UserValidationException
    {
    	Assert.assertTrue(user.user.check("Pra"));
    }
    
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse6() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.user.check(""));
    	
    }catch(UserValidationException e)
    	{
    		Assert.assertEquals("enter proper name",e.getMessage());
    		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_EMPTY,e.exception);

         }
    }
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse7() throws UserValidationException
    {
    	try {
    	Assert.assertFalse(user.user.check(null));
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
    	Assert.assertFalse(user.user.check("praneetha"));
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
    	Assert.assertFalse(user.user.check("Pr"));
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
    	Assert.assertFalse(user.user.check("Praneetha1"));
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
    	Assert.assertFalse(user.user.check("Praneetha@"));
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
    	Assert.assertFalse(user.user.check("PRANEETHA"));
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
    	Assert.assertTrue(user.user.check("Chodey"));
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
    	Assert.assertFalse(user.user.check("chodey"));
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
    	Assert.assertFalse(user.user.check(""));
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
    	Assert.assertFalse(user.user.check(null));
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
    		Assert.assertFalse(user.user.check("Ch"));
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
    	Assert.assertFalse(user.user.check("Chodey@555"));
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
    	Assert.assertFalse(user.user.check("CHODEY"));
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
    	Assert.assertTrue(user.phoneCheck.check("91 9999999999"));
    	
    }
    
    //space not given
    @Test
    public void whenGivenPhoneShouldReturnFalse()
    {
    	try {
    	Assert.assertFalse(user.phoneCheck.check("919999999999"));
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
    	Assert.assertFalse(user.phoneCheck.check(""));
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
    	Assert.assertFalse(user.phoneCheck.check(null));
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
    	Assert.assertFalse(user.phoneCheck.check("91 999999999"));
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
    	Assert.assertFalse(user.phoneCheck.check("99hee99999"));
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
    	Assert.assertFalse(user.phoneCheck.check("9999999999"));
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
    	Assert.assertFalse(user.phoneCheck.check("91 9999999999999999"));
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
    	Assert.assertTrue(user.passwordCheck.check("Praneetha@5555"));
    }
    
    //didnt give number and uppercase
    @Test
    public void whenGivenPasswordShouldReturnFalse1()
    {
    	try {
    	Assert.assertFalse(user.passwordCheck.check("Pranee"));
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
    	Assert.assertFalse(user.passwordCheck.check(""));
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
    	Assert.assertFalse(user.passwordCheck.check(null));
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
    	Assert.assertFalse(user.passwordCheck.check("praneetha@123"));
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
    	Assert.assertFalse(user.passwordCheck.check("Praneetha@"));
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
    	Assert.assertFalse(user.passwordCheck.check("Praneetha5566"));
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
    	Assert.assertFalse(user.passwordCheck.check("Praneetha@5566@"));
    }catch(UserValidationException e)
    	{
		Assert.assertEquals("enter proper password",e.getMessage());
		Assert.assertEquals(UserValidationException.exceptionType.ENTERED_INVALID,e.exception);

     }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

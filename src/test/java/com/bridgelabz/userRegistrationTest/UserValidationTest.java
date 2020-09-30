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
    public void whenGivenFirstNameShouldReturnTrue()
    {
    	Assert.assertTrue(user.firstNameCheck("Praneetha"));
    }
     
    //given name of 3 letters
    @Test
    public void whenGivenFirstNameShouldReturnTrue1()
    {
    	Assert.assertTrue(user.firstNameCheck("Pra"));
    }
    
    //given all lower case 
    @Test
    public void whenGivenFirstNameShouldReturnFalse()
    {
    	Assert.assertFalse(user.firstNameCheck("praneetha"));
    }
    
    //given only 2 characters
    @Test
    public void whenGivenFirstNameShouldReturnFalse1()
    {
    	Assert.assertFalse(user.firstNameCheck("Pr"));
    }
    
    //given number in name
    @Test
    public void whenGivenFirstNameShouldReturnFalse2()
    {
    	Assert.assertFalse(user.firstNameCheck("Praneetha1"));
    }
    
    //given spl character in name
    @Test
    public void whenGivenFirstNameShouldReturnFalse4()
    {
    	Assert.assertFalse(user.firstNameCheck("Praneetha@"));
    }
    
    //given all upper case
    @Test
    public void whenGivenFirstNameShouldReturnFalse5()
    {
    	Assert.assertFalse(user.firstNameCheck("PRANEETHA"));
    }
    
    //given correct name
    @Test
    public void whenGivenLastNameShouldReturnTrue()
    {
    	Assert.assertTrue(user.firstNameCheck("Chodey"));
    }
    
    //given all lower case
    @Test
    public void whenGivenLastNameShouldReturnFalse()
    {
    	Assert.assertFalse(user.firstNameCheck("chodey"));
    }
    
    //given only 2 characters
    @Test
    public void whenGivenLastNameShouldReturnFalse1()
    {
    	Assert.assertFalse(user.firstNameCheck("Ch"));
    }
   
    //given special characters and numbers in name 
    @Test
    public void whenGivenLastNameShouldReturnFalse2()
    {
    	Assert.assertFalse(user.firstNameCheck("Chodey@555"));
    }
    
    //given uppercase only
    @Test
    public void whenGivenLastNameShouldReturnFalse4()
    {
    	Assert.assertFalse(user.firstNameCheck("CHODEY"));
    }
    
    //given correct number
    @Test
    public void whenGivenPhoneShouldReturnTrue()
    {
    	Assert.assertTrue(user.phoneCheck("91 9999999999"));
    }
    
    //space not given
    @Test
    public void whenGivenPhoneShouldReturnFalse()
    {
    	Assert.assertFalse(user.phoneCheck("919999999999"));
    }
    
    //only 9 numbers are given
    @Test
    public void whenGivenPhoneShouldReturnFalse1()
    {
    	Assert.assertFalse(user.phoneCheck("91 999999999"));
    }
    
    //characters given in number
    @Test
    public void whenGivenPhoneShouldReturnFalse2()
    {
    	Assert.assertFalse(user.phoneCheck("99hee99999"));
    }
    
    //didnt give country code
    @Test
    public void whenGivenPhoneShouldReturnFalse3()
    {
    	Assert.assertFalse(user.phoneCheck("9999999999"));
    }
    
    //given more than 10 numbers
    @Test
    public void whenGivenPhoneShouldReturnFalse4()
    {
    	Assert.assertFalse(user.phoneCheck("91 9999999999999999"));
    }
    
    
    //gave correct password
    @Test
    public void whenGivenPasswordShouldReturnTrue()
    {
    	Assert.assertTrue(user.passwordCheck("Praneetha@5555"));
    }
    
    //didnt give number and uppercase
    @Test
    public void whenGivenPasswordShouldReturnFalse1()
    {
    	Assert.assertFalse(user.passwordCheck("Pranee"));
    }
    
    //no uppercase
    @Test
    public void whenGivenPasswordShouldReturnFalse2()
    {
    	Assert.assertFalse(user.passwordCheck("praneetha@123"));
    }
    
    //no number
    @Test
    public void whenGivenPasswordShouldReturnFalse3()
    {
    	Assert.assertFalse(user.passwordCheck("Praneetha@"));
    }
    
    //no special character
    @Test
    public void whenGivenPasswordShouldReturnFalse4()
    {
    	Assert.assertFalse(user.passwordCheck("Praneetha5566"));
    }
    
    //more than one special character
    @Test
    public void whenGivenPasswordShouldReturnFalse5()
    {
    	Assert.assertFalse(user.passwordCheck("Praneetha@5566@"));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

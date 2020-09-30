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
    @Test
    public void whenGivenFirstNameShouldReturnTrue()
    {
    	Assert.assertTrue(user.firstNameCheck("Praneetha"));
    }
     
    @Test
    public void whenGivenFirstNameShouldReturnTrue1()
    {
    	Assert.assertTrue(user.firstNameCheck("Pra"));
    }
    
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse()
    {
    	Assert.assertFalse(user.firstNameCheck("praneetha"));
    }
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse1()
    {
    	Assert.assertFalse(user.firstNameCheck("Pr"));
    }
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse2()
    {
    	Assert.assertFalse(user.firstNameCheck("Praneetha1"));
    }
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse3()
    {
    	Assert.assertFalse(user.firstNameCheck("Praneetha1"));
    }
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse4()
    {
    	Assert.assertFalse(user.firstNameCheck("Praneetha@"));
    }
    
    @Test
    public void whenGivenFirstNameShouldReturnFalse5()
    {
    	Assert.assertFalse(user.firstNameCheck("PRANEETHA"));
    }
    
    @Test
    public void whenGivenLastNameShouldReturnTrue()
    {
    	Assert.assertTrue(user.firstNameCheck("Chodey"));
    }
    
    
    @Test
    public void whenGivenLastNameShouldReturnFalse()
    {
    	Assert.assertFalse(user.firstNameCheck("chodey"));
    }
    
    @Test
    public void whenGivenLastNameShouldReturnFalse1()
    {
    	Assert.assertFalse(user.firstNameCheck("Ch"));
    }
    
    @Test
    public void whenGivenLastNameShouldReturnFalse2()
    {
    	Assert.assertFalse(user.firstNameCheck("Chodey@555"));
    }
    
    @Test
    public void whenGivenLastNameShouldReturnFalse4()
    {
    	Assert.assertFalse(user.firstNameCheck("CHODEY"));
    }
    
    @Test
    public void whenGivenPhoneShouldReturnTrue()
    {
    	Assert.assertTrue(user.phoneCheck("91 9999999999"));
    }
    
    @Test
    public void whenGivenPhoneShouldReturnFalse()
    {
    	Assert.assertFalse(user.phoneCheck("919999999999"));
    }
    
    @Test
    public void whenGivenPhoneShouldReturnFalse1()
    {
    	Assert.assertFalse(user.phoneCheck("91 999999999"));
    }
    
    @Test
    public void whenGivenPhoneShouldReturnFalse2()
    {
    	Assert.assertFalse(user.phoneCheck("99hee99999"));
    }
    
    @Test
    public void whenGivenPhoneShouldReturnFalse3()
    {
    	Assert.assertFalse(user.phoneCheck("9999999999"));
    }
    
    @Test
    public void whenGivenPhoneShouldReturnFalse4()
    {
    	Assert.assertFalse(user.phoneCheck("91 9999999999999999"));
    }
    
    
    
    
    
    
    
    
    
    
}

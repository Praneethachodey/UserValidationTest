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
}

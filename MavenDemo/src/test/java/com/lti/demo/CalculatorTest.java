package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	Calculator c = new Calculator();
	
	@Disabled
	@Test
	public void testsayHello()
	{
		Assertions.assertEquals("Hello", c.sayHello());
	}

	@Test
	public void testAdd()
	{
								//expected  // actual // msg if test case fails
		Assertions.assertEquals(100,c.add(60, 40));
	}
	
	@Test
	void testAssertFalse()
	{
		Assertions.assertTrue("meenal".length()==6);
		Assertions.assertFalse("meenal".length()==10);//runs if condition is false
		Assertions.assertNotEquals("Hello", "hello");
		
		
	}
	void testAssertNull()
	{
		String str1=null;
		String str2="abcd";
		Assertions.assertNull(str1);
		Assertions.assertNotNull(str2);
	}
	
	@Test
	public void testArrayList()
	{
		ArrayList<Integer> myList= new ArrayList<Integer>();
		Assertions.assertEquals(0, myList.size());
		
	}
	
}

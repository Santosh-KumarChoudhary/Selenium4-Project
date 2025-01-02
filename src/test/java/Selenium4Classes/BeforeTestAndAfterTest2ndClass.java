package Selenium4Classes;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class BeforeTestAndAfterTest2ndClass {
	
	

	public void login2()
	
	{
		System.out.println("I'm logged in 2");
	}
	
	@Test()
	
	public void homePage2()
	{
		System.out.println("Landed on home 2");
	}
	
	@Test()
	public void searchProduct2()
	
	{
System.out.println("Searching for product 2");
	}
	
	@Test()
	public void addToTheCart2()
	
	{
		System.out.println("Product added to the cart 2");
	}
	
	
	
	
	@AfterClass
	public void logout()
	
	{
		System.out.println("Logged out 2");
	}

}

package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodsExecution {
	
	
	// @BeforeMethod ==>> it will be executed before every @Test method
	// If there are 3 method , it will be executed 3 times before every @Test method
	//@AfterMethod --> It will be executed every @Test methods present in the page.
	
	
	@BeforeMethod
	
	public void login()
	
	{
		System.out.println("Before Method ");
	}
	
	@Test()
	
	public void homePage()
	{
		System.out.println("Landed on home ");
	}
	
	@Test()
	public void searchProduct()
	
	{
System.out.println("Searching for product");
	}
	
	@Test()
	public void addToTheCart()
	
	{
		System.out.println("Product added to the cart");
	}
	
	
	
	
	@AfterMethod
	public void logout()
	
	{
		System.out.println("After Method");
	}

}

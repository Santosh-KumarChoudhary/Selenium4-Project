package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClassAndAfterClassExecution {
	
	
	// @BeforeClass will be executed only once in the entire class 
	// @AfterClass will be executed only once . These re used to set up and tear down process/
	// If i want login method should be executed only once in the class then we can
	// use @BeforeClass annotation 
	
	
	
@BeforeClass
	
	public void login()
	
	{
		System.out.println("I'm logged in ");
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
	
	
	
	
	@AfterClass
	public void logout()
	
	{
		System.out.println("Logged out");
	}

}

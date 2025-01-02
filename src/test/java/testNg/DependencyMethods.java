package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyMethods {
	
	
	
	@Test (priority=12)
	public void m1()
	
	{
		System.out.println("Open App");
		Assert.assertTrue(true);
	}
	
	
	@Test(dependsOnMethods= {"m1"})
	public void m2()
	
	{
		System.out.println("Log in");
		
		//Assert.assertTrue(false);
	}
	
	
	


	@Test(priority =4, dependsOnMethods={"m3","m2"})
	public void m4()
	
	{
		System.out.println("Search result");
	}
	
	@Test(priority=3,dependsOnMethods= {"m2"})
	public void m3()
	
	{
		System.out.println("Search");
		
		Assert.assertTrue(false);
	}
	
	
	@Test(priority=0)
	public void m5()
	
	{
		System.out.println("m5 method");
	}
	
	

}

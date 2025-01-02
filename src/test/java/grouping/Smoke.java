package grouping;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Smoke {
	

	@Test (priority=12,groups= {"smoke"})
	public void m1()
	
	{
		System.out.println("Open App");
		AssertJUnit.assertTrue(true);
	}
	
	
	@Test(groups= {"smoke"})
	public void m2()
	
	{
		System.out.println("Log in");
		
		//Assert.assertTrue(false);
	}
	
	
	


	@Test(groups= {"smoke"})
	public void m4()
	
	{
		System.out.println("Search result");
	}
	
	@Test(priority=3,groups= {"smoke"})
	public void m3()
	
	{
		System.out.println("Search");
		
		//AssertJUnit.assertTrue(false);
	}
	
	
	@Test(priority=0,groups= {"smoke","regression","functional"})
	public void m5()
	
	{
		System.out.println("m5 method");
	}
	

}

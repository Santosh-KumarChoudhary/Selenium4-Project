package grouping;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sanity {
	

	@Test (priority=12,groups={"sanity"})
	public void m1()
	
	{
		System.out.println("Open App");
		AssertJUnit.assertTrue(true);
	}
	
	
	@Test(groups= {"sanity"})
	public void m2()
	
	{
		System.out.println("Log in");
		
		//Assert.assertTrue(false);
	}
	
	
	


	@Test(priority =4, groups={"sanity"})
	public void m4()
	
	{
		System.out.println("Search result");
	}
	
	@Test(priority=3,groups= {"sanity"})
	public void m3()
	
	{
		System.out.println("Search");
		
	//	AssertJUnit.assertTrue(false);
	}
	
	
	@Test(priority=0,groups= {"sanity"})
	public void m5()
	
	{
		System.out.println("m5 method");
	}
	

}

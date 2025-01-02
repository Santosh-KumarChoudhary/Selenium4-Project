package grouping;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Regression {
	

	@Test (priority=12,groups="regression")
	public void m1()
	
	{
		System.out.println("Open App");
		AssertJUnit.assertTrue(true);
	}
	
	
	@Test(groups= {"regression"})
	public void m2()
	
	{
		System.out.println("Log in");
		
		//Assert.assertTrue(false);
	}
	
	
	


	@Test(priority =4, groups={"regression"})
	public void m4()
	
	{
		System.out.println("Search result");
	}
	
	
	@Test(priority=0,groups= {"regression","smoke","functional"})
	public void m5()
	
	{
		System.out.println("m5 method");
	}
	

}

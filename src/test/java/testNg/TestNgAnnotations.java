package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgAnnotations {
	
	
	
	@Test()
	
	public void login()
	{
		System.out.println("Logging");
	}
	
	
	@Test(priority=2)
	public void homePage()
	
	{
		System.out.println("Home Page");
	}
	
	@Test(priority=2)
	public void checkOut()
	
	{
		System.out.println("Checked out");
	}
}

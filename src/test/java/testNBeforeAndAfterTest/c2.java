package testNBeforeAndAfterTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 {
	
	

	@Test
	public void login2()
	
	{
		System.out.println("logged in 2");
	}
	
	
	
	
	
	
@AfterTest
	public void logout()
	
	{
		System.out.println("After Test");
	}

}

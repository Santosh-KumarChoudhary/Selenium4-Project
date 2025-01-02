package testNBeforeAndAfterTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class c1 {
	
	// It is same as @BeforeClass and @AfterClass but it executed test cases from 2 different class
	// Suppose  1 class has @BeforeTest annnotation and another class has @AfterTest annotation
	//then First it will @BeforeTest method and all the @Test method from class1 and class 2
	//And Finally it will execute @Aftermethod 
	
	
	
	@BeforeTest
	public void login()
	
	{
		System.out.println(" Before Test ");
	}
	
	@Test()
	
	public void homePage()
	{
		System.out.println("homePage 1 ");
	}
	
	
	
	
	
	@Test
	public void logout()
	
	{
		System.out.println("Logged out 1");
		
		
		System.out.println("**********************************");
	}

}

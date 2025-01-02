package allannotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	
	@BeforeSuite
	public void beforeSuit()
	
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void beforeTest()
	
	{
		System.out.println("Before Test");
	}
	
	
	@BeforeClass
	public void beforeClass()
	
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	
	public void afterMethod()
	
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("This is after class");
	}
	
	@AfterTest
	public void afterTest()
	
	{
		System.out.println("After Test ");
	}
	
	@AfterSuite
	public void afterSuite()
	
	{
		System.out.println("After suite method");
	}
	
	
	@Test
	public void m1()
	
	{
		System.out.println("Test 1");
	}
	
	
	@Test
	public void m2()
	
	{
		System.out.println("Test 2");
	}
	
	
	
	@Test
	public void m3()
	
	{
		System.out.println("Test 3");
	}
	
	

}

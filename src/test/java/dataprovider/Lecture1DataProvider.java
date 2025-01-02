package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lecture1DataProvider {
	
	WebDriver driver;
	
	@BeforeClass
	void launch()
	
	{
		driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="input")
	void ligin(String name , String pwd)
	
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys(name);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	boolean status=	driver.findElement(By.xpath("//a[@ class=\"list-group-item\" and text()='My Account']")).isDisplayed();
	
	if(status==true)
		
	{
		//Assert.assertTrue(status);
		
		driver.findElement(By.xpath("//a[@ class=\"list-group-item\" and text()='Logout']")).click();
		
		Assert.assertTrue(true);
	}
	else
	{
		Assert.fail();
	}
		
	}

	@AfterClass
	void logout()
	
	{
		driver.close();
	}
	
	
	@DataProvider(name="input", indices= {0,1})
	public  Object [] [] loginInnput()
	
	{
		
	String data [] []= 
		
		{
				{"san.com","1233"},
				{"bittu@g.com","san123"},
				
				{"bittuSab@g.com","san123"},
				
				{"NishuSab@g.com","san123"}

				
				
		};	
	
	
	return data;
			
			
	}
		
	
	
	
	
	
}

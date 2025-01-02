package listeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


@Listeners(listeners.ListenerclasswithImplementation.class)


public class NinjaCart  {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void launch()
	{
	
	
	   driver= new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com.gr/");
		
		
	}
	
	@Test()
	public void mouseHover() throws InterruptedException
	{
		
		
	WebElement desktop=	driver.findElement(By.xpath("//a[text()='Desktops']"));
	
WebElement Mac=	driver.findElement(By.xpath("//div[@class='dropdown-menu']//a[contains(text(),'Mac (1)')]"));

Actions act= new Actions(driver);



Thread.sleep(3000);


//here build() is optional

//build is used to build the action  and perform to perform the action


//act.moveToElement(desktop).moveToElement(Mac).click() .build().perform();

act.moveToElement(desktop).moveToElement(Mac).click() .build().perform();


System.out.println("Clicked on Mac ");
		

	}
	
	
	@Test
	public void myFailedmethod()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void mySkippedMethod()
	
	{
		System.out.println("log in sucessfully");
	}
	  
	
	
	@AfterClass
	public void tearDown()
	
	{
		driver.close();
	}
	  
}

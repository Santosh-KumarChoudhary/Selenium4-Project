package Selenium4Classes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsHeadLessusing {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("--headless");
		
	WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.id("name")).sendKeys("Helllo Java");
		Thread.sleep(3000);

		
		//WebElement enteText=driver.findElement(By.id("name")).
		
	if(driver.getTitle().equals("Automation Testing Practice"))
		
	{
		System.out.println("Pass");
	}
	
	else
	{
		System.out.println("fail");
	}
	
	
	driver.close();

	
	///System.out.println("Text entered :"+enteText);
	
		
		
//	driver.close();
	}

}

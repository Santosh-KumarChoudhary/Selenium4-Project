package Selenium4Classes;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesPROG {
	
	@Test
	public void cookies()
	
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
	Set<Cookie> cooki=	driver.manage().getCookies();
	System.out.println(cooki);
	
	for(Cookie co: cooki)
		
	{
		System.out.println(co.getValue());
	}
	
	
		
		
		
		
		
		
		
	}

}

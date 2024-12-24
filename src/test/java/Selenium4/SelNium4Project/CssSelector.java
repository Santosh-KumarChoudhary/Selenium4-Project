package Selenium4.SelNium4Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//using tag and Id 
		//syntax tag#id or just #id
			
		
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt");
		
		
		//Now using tag and class
		//tag.class
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirt");
		
		
		//using tag and attributr
		//syntax input[name='q']
		
		
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Hello");
		
		//Now using last approach tag class and attribute
		//input.class[attribute='value']
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Hello");
		driver.quit();
		
		
		
	}

}

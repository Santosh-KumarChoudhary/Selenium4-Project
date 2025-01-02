package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutoruses {
	
	//https://testautomationpractice.blogspot.com/
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement name=driver.findElement(By.id("name"));
		
		// Now usingJavascriptExecutor interface and it's method executeScript() to perform send keys
		
		// As driver is object reference of WebDriver , we can not directly use it with JavascriptExecute
		//interface  as there is no any relation between WebDriver driver  Interface and 
		//JavascriptExecute . So it can be handled by up casting
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Santosh')",name);
		
		
	WebElement male=	driver.findElement(By.id("male"));
	
	js.executeScript("arguments[0].click()",male);
	
	System.out.println("Clicked on the Radio Button");
		
		
		
		
		
		
		
	}

}

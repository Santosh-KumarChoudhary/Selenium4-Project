package Selenium4Classes;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsorPopUp {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
//		Thread.sleep(3000);
//		
//		
//		// Normal Alert
//		
//	Alert alert=	driver.switchTo().alert();
//	
//	String alertText=alert.getText();
//	
//	alert.accept();
//	System.out.println("Alert text is "+alertText);
//
//		
//		System.out.println("Alert accepted");
//		driver.close();
		
		
		
		//Confirmation alert means having OK and CANCEL
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		
		
		// Type 3 Prompt Alert
		// Along with OK , CANCEL some values can be passed
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
	Alert alert=	driver.switchTo().alert();
	Thread.sleep(3000);
	
	alert.sendKeys("Santosh");
	alert.accept();
	
	System.out.println("Alert handled");
	
	driver.close();
		
		
		
	}

}

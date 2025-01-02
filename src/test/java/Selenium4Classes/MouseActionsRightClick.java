package Selenium4Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionsRightClick {
	
	public static void main(String[] args) throws InterruptedException {
		
		
//WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
	WebElement right=	driver.findElement(By.xpath("//span[text()='right click me']"));
	
	
	Actions act = new Actions(driver);
	
	
	Thread.sleep(2000);
	act.contextClick(right).perform();
	System.out.println("Right Clicked");
	
	// Now click on copy
	
	driver.findElement(By.xpath("//span[text()='Copy']")).click();
	
	Thread.sleep(2000);
	
	driver.switchTo().alert().accept();
	
	System.out.println("Alert accepted");
	
	
	}

}

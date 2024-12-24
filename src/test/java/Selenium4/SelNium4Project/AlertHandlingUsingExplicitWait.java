package Selenium4.SelNium4Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandlingUsingExplicitWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		
		
		
	Alert alert=	wait.until(ExpectedConditions.alertIsPresent());
	
	//WebDriverWait wait = new webDriverWait(driver, Duration.ofSeconds(0))
	
	// Alert alert=wait.until(ExpectedCondition.alertIsPresent()
	//alert.getText();
	Thread.sleep(3000);
	
	System.out.println(alert.getText());
	alert.accept();
		
		System.out.println("Alert accepted");
		
		
		
	}

}

package Selenium4Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActionHover {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com.gr/");
		
		
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

}

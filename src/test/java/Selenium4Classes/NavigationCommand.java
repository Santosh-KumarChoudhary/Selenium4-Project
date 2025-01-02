package Selenium4Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommand {

	
	
	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();

	WebDriver driver = new ChromeDriver()	;
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.navigate().to("https://demo.nopcommerce.com/");
	
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().refresh();
	
	
	
	}
}

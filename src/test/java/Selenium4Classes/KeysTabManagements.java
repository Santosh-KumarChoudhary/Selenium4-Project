package Selenium4Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysTabManagements {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
	//	driver.switchTo().newWindow(driver.get("https://jqueryui.com/datepicker/"));
		
		
		// switching to new window using newWindow(WindowType.TAB)
		
		//it will open a new new tab with another url
		
		//'driver.switchTo().newWindow(WindowType.TAB);
		
		
		// Now opeing 2 web pages in 2 diffrenet wind
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.findElement(By.xpath("//a[text()='Demos']")).click();
		
		
		
		
	}

}

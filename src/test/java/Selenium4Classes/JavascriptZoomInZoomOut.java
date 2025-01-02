package Selenium4Classes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptZoomInZoomOut {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		js.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(5000);
		
		js.executeScript("document.body.style.zoom='120%'");
		
	}

}

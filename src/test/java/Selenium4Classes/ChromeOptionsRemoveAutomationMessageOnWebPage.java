package Selenium4Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsRemoveAutomationMessageOnWebPage {
	
	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		
		options.setExperimentalOption("excludeSwitches",new String [] {"enable-automation"});
		
		
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println(driver.getTitle());
	}
	

}

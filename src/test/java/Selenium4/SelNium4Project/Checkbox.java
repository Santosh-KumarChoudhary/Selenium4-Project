package Selenium4.SelNium4Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
	List<WebElement> checkboxes=	driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type='checkbox']"));
	
	System.out.println("total check boxes are "+checkboxes.size());
	
//	for(WebElement element:checkboxes)
//		
//	{
//		element.click();
//	}
//	
//	System.out.println("Elements clicked");
	
	
	// Select last 3 checkboxes
//	
//	for(int i=4;i<checkboxes.size();i++)
//		
//	{
//		checkboxes.get(i).click();
//	}
	
	
	//select first 3 check boxes
	
//	
//	for(int i=0;i<3;i++)
//		
//	{
//		checkboxes.get(i).click();
//	}
	
	
	
	// Unselect selected checkbox
	
	//first select few check boxes and then unselect them
	
	for(int i=0;i<3;i++)
		
	{
		checkboxes.get(i).click();
		
		
	}
	
	Thread.sleep(5000);
	
	for(int i=0;i<checkboxes.size();i++)
		
	{
		if(checkboxes.get(i).isSelected())
		{
			checkboxes.get(i).click();
		}
	}

	
	driver.close()	;
	}
	
	


}

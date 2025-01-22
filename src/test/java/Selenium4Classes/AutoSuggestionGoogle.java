package Selenium4Classes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionGoogle {
	@Test
	public void launch()
	
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Shoes");
		
		
		////div[@id='Alh6id']//ul//li
		
		
	List<WebElement> list=	driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//li"));
	
	System.out.println(list.size());
	
	for(WebElement all:list)
		
	{
		System.out.println(all.getText());
		
		
	}
	
	//System.out.println(list.get(2).getText());
		
		
		
		//	.close();

		
	}

}

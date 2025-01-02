package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownAssignments {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("comboBox")).click();
		
	int count= 	driver.findElements(By.xpath("//div[@id='dropdown']//div")).size();
	
	List<WebElement> ele= 	driver.findElements(By.xpath("//div[@id='dropdown']//div"));

	
	System.out.println("Total dropdown itesm "+count);
	
	for(int i=0;i<=10;i++)
		
	{
	  String itemName=ele.get(i).getText();
	  System.out.println(itemName);
	  
	  if(itemName.equals("Item 4"))
		  break;
	}
		
	System.out.println("Got the Item");
	driver.close();
		
	}

}

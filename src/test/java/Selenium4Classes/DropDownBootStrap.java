package Selenium4Classes;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownBootStrap {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//Selecting single Drop Down
		
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		
		
		
		//Multi Selection 
	List<WebElement> alldropdowns=	driver.findElements(By.xpath("//ul[@class=\"multiselect-container dropdown-menu\"]//label[@class='checkbox']"));
	
	
	
	System.out.println("Number of Options :"+alldropdowns.size());
	for(WebElement all:alldropdowns)
		
	{
		System.out.println(all.getText());
		
		//to select all the drop down
		
	//	all.click();
		
		//to select any paticular drop down based on drop down
	String option=	all.getText();
	
	if(option.equalsIgnoreCase("Java")|| option.equalsIgnoreCase("c#") || option.equalsIgnoreCase("Python"))
	
	{
	if(!all.isSelected())
	{
		all.click();
		System.out.println("Selected :"+option);
	}
	else
	{
		System.out.println(option +" are Already selecetd");
	}
		
	}
	
	
	}
		
		System.out.println("Execution Completed");
		
		
		
		driver.close();
		
		
		//
		
		//Check if the  Java element is selected or not , if not select the element
		//for(WebElemnet option : classElement)
		
		//option.getText();
		//if(option.getText().equalsIgnoreCase("Java")
		// if(!option.isSelected())
		//option.click();
		
		
	}

}

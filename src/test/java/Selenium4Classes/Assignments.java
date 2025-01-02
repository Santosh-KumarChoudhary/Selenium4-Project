package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignments {
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		driver.findElement(By.xpath("//input[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	List<WebElement>links=	driver.findElements(By.xpath("//div[@class='wikipedia-search-main-container']"));

System.out.println(links.size());

	
	//System.out.println(links.);
	
	for(WebElement ele: links)
		
	{
String title=	ele.getText();
	
	System.out.println("Titles are "+title);
		
	
	}
	
	System.out.println("execution completed");
}
}
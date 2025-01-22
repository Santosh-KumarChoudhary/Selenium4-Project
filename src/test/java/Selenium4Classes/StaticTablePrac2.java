package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticTablePrac2 {
	
	@Test
	public void staticTable()
	
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//get row
		
		
		
	List<WebElement> table=	driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
	
	System.out.println(table.size());
	
	for(int i=2;i<=table.size();i++)
		
	{
	String element=	driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]")).getText();
	
	System.out.println(element);
		
		
	}
	
	// Now print the Author name and their book name
	System.out.println("BookName "+ " Author Name");

	
		for(int i=2;i<=table.size();i++)
			
		{
		String bookName=	driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td[1]")).getText();
		
		String author=	driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+i+"]//td[2]")).getText();

		System.out.println(bookName +" "+ author);
			
		}
		
		
		System.out.println("***********Dynamic Table ******************");
		
	List<WebElement> list2=	driver.findElements(By.xpath("//tbody[@id='rows']//tr"));
	
	
	
	
	for(int i=1;i<=list2.size();i++)
		
		
	{
	String all=	driver.findElement(By.xpath("//tbody[@id='rows']//tr["+i+"]")).getText();
	
	System.out.println(all);
	}
		
		
	}

}

package Selenium4Classes;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlebrowsersWindow {
	
	
	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//	System.out.println(driver.getTitle());

		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		
		//capture windows Id
	Set<String> windows=	driver.getWindowHandles();
	
	
	//Approach 1 when we have 1 or 2 windows 
	
//	List<String>windowList= new ArrayList(windows);
//	
//	
//	String parentId=windowList.get(0);
//	
//	
//	String childId=windowList.get(1);
//	
//	
//	//It will return parent window title as focused is still on the parent window
//	
//	System.out.println(driver.getTitle());
//	
//	driver.switchTo().window(childId)	;
//	
//	System.out.println(driver.getTitle());
//	
//	//switching back to Parent window
//	driver.switchTo().window(parentId);
//	
//	System.out.println("Expecting parent window");
//	
//	System.out.println(driver.getTitle());
	
	
	
	//Approach 2 through looping 
	
	for(String windowId:windows)
		
	{
	String title=	driver.switchTo().window(windowId).getTitle();
	
	System.out.println("Title are "+title);
	
	
	if(title.equals("Human Resources Management Software | OrangeHRM")|| title.equals("San"))
		
	{
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Santosh");
		System.out.println("Text entered");
		
		driver.close();
	}
	
	
	System.out.println("***********Execution Completed********************");
	
	//driver.quit();
		
	}

	
	
	
		
		
		
		
	}
	
	

}

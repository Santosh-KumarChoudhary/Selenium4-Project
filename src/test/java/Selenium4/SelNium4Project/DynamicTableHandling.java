package Selenium4.SelNium4Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableHandling {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php?route=common/login");
		
		driver.findElement(By.name("username")).sendKeys("demoadmin");
		driver.findElement(By.name("password")).sendKeys("demopass");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		driver.findElement(By.xpath("//ul[@id='collapse9']//a[contains(text(),'Customers')]")).click();
		
		// //ul[@id='collapse9']//li[Contains(text(),'Customers')]
		
	String pagination=	driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
	
	
	//Using subString method we are storing value fro the text on the webpage - " Showing 1 to 20 of 758 (38 Pages)
// here  38 pages is dynamic but the number under  this "(" is constant.
	//indexOf method get the index of that first charcter
	//
	
	int totalPages=Integer.parseInt(pagination.substring(pagination.indexOf("(")+1,pagination.indexOf("Pages")-1));
//nt totalCountPages=	(totalPages);
	
	System.out.println("Total Pages are "+totalPages);
	

	
	
		System.out.println("Execution completed");
		
		driver.close();
	}

}

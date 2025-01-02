package Selenium4Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTableBootStraphandling {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		////div[@class='orangehrm-container']//div[@role='table']//div[@role='row']
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div//span[text()='Admin']")).click();
		
int rowCount=	driver.findElements(By.xpath("//div[@class=\"oxd-table-body\" and @role='rowgroup']//div[@role='row']")).size();

//driver.findElements(By.xpath("//div[@class="oxd-table-body" and @role='rowgroup']//div[@role='row']"))
	

System.out.println("rowCount "+rowCount);




driver.close();
		
	}

}

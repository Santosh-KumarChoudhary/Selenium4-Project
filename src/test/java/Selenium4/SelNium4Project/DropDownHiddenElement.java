package Selenium4.SelNium4Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHiddenElement {
	
	public static void main(String[] args) {
		
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-up-fill oxd-select-text--arrow']")).click();
		
		System.out.println("Clicked on drop down");
		
	}

}

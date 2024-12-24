package Selenium4.SelNium4Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		//declaration
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		
        driver.get("https://demo.opencart.com.gr/");
        
        
        
    WebElement elem=    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'iPhone')]")));
		//driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click()
    
    elem.click();
    
// WebElement elm2=   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("hello")));
    
		
    
    System.out.println("Execution completed");
		driver.close();
				
		
		
		
		
	}

}

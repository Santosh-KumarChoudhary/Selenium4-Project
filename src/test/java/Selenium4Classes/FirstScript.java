package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	
	   public static void main(String[] args) throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
	     //   WebDriverManager.i
	        

	
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	      
	        driver.get("https://demo.opencart.com.gr/");
	        
	       

	        System.out.println("Page Title: " + driver.getTitle());
	        
	       // driver.findElement(By.id("input-username")).sendKeys("demo");
	        
	       // driver.findElement(By.id("input-password")).sendKeys("demo");
	        
	    //    driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	     boolean logo=   driver.findElement(By.xpath("//div[@id='logo']")).isDisplayed();
	     
	     System.out.println("Is Logo Displayed :"+logo);
	     
	     
	     //driver.findElement(By.linkText()).click();
	     
	     //driver.findElement(By.partialLinkText("Tab")).click();
	    // driver.findElement(By.linkText("iPhone")).click();
	     
	     driver.findElement(By.partialLinkText("iPh")).click();
	     System.out.println("Clicked on iPhone");
	     Thread.sleep(5000);
	     
	     
	List<WebElement>  elem=   driver.findElements(By.className("list-inline-item"));
	
	System.out.println("Total items are "+elem.size());
	
	
	//Using tagName to get all the links
	
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	
	
	//Using tagName to get all the iamges present on the webpage
	List<WebElement> allImages=driver.findElements(By.tagName("img"));
	
	System.out.println("All images are "+allImages.size());
	
	System.out.println("Total Number os links"+allLinks);
	
	
	        
	        
	        

	        driver.quit();
	    }
}

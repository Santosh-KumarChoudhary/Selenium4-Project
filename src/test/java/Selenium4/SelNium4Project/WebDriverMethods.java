package Selenium4.SelNium4Project;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {
	
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
			driver.get("https://www.qafox.com/selenium/selenium-practice/");

		// driver.get("https://demo.opencart.com.gr/");
		String source= driver.getPageSource();
		
		//System.out.println("Sourec"+source);
		
		//Will return id of the single window
		
	String windowId=	driver.getWindowHandle();
	
	System.out.println("windowName "+windowId);
	
	/// Will return id of multiple browser window
	
	
	
	//driver.findElement(By.xpath("//a[contains(text(),'Check our Youtube Channel')]")).click()	;
Set<String> windowsId=	driver.getWindowHandles();

System.out.println("ALL ids "+windowsId);


boolean isdisplayed=driver.findElement(By.cssSelector("img[alt='QAFox']")).isDisplayed();

System.out.println("is logo isDisplayed "+isdisplayed);


boolean isSearchenabled=driver.findElement(By.cssSelector("[id='s']")).isEnabled();

System.out.println("isSearchenabled "+isSearchenabled);

//for(int i=0;i<=windowsId.size();i++)
//	
//{
//	System.out.println("Titles are "+driver.getTitle());
//}
	
	
		
		System.out.println(" ******************Execution completed ********************************************");
		 
		 
		 
		 driver.quit();
	}

}

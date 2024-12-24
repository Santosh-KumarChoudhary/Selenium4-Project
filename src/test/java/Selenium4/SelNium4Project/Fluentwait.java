package Selenium4.SelNium4Project;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwait {
	
	public static void main(String[] args) {
		
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver()	;
	
	
Wait<WebDriver>mywait= new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(5))
.ignoring(NoSuchElementException.class);




	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	
	
	

}
}
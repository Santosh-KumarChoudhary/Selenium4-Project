package crossbrowserscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("Chrome");
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys("s@s.com");
		
		Thread.sleep(3000);
		
		System.out.println("Execution Over");
		
		
	}
	
	
	public static void launchBrowser(String name)
	
	{
		
	//String browser=	name.equalsIgnoreCase();
		
		
		switch (name.toLowerCase())
		
		{
			case "chrome":
				
				driver = new ChromeDriver();
				
				break;
				
			case "firefox":
				
				driver= new FirefoxDriver();
				break;
				
				
				
		}
		
	}

}

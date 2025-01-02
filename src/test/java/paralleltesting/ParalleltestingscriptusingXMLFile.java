package paralleltesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParalleltestingscriptusingXMLFile {
	
	
	WebDriver driver;
	
	@Test(priority=1)
	@Parameters({"browser","url"})
	public void setUp(String br, String url) throws InterruptedException
	
	{
		
		
		switch (br.toLowerCase())
		{
		case "chrome":
			driver= new ChromeDriver();
			
			break;
			
		case "firefox":
			driver= new FirefoxDriver();
			break;
			
		case "edge":
			
			driver= new EdgeDriver();
			break;	
			
			default : System.out.println("Invalid Browser");
			return;
		}
driver.get(url);	


driver.manage().window().maximize();

Thread.sleep(5000);


		
	}
	
	@Test(priority=2)
	public void logodisplayed()
	
	{
		boolean status=driver.findElement(By.xpath("//a[text()='Qafox.com']")).isDisplayed();
		
		Assert.assertTrue(status);
	}
	
	@Test(priority=3)
	public void tearDown()
	
	{
		
		System.out.println("Closing the browser");
		driver.close();
		
	}
	

}

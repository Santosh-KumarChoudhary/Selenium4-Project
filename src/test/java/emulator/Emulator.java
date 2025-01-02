package emulator;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Emulator {
	
	
	@Test
	
	public void launchEmulator() throws InterruptedException
	
	{
		ChromeOptions options = new ChromeOptions();
		Map<String, String> mobileEmulation = new HashMap<>();
		mobileEmulation.put("deviceName", "iPhone X");
		
		options.setExperimentalOption("mobileEmulation", mobileEmulation);

		
WebDriver driver = new ChromeDriver(options);

driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

Thread.sleep(3000);


JavascriptExecutor js=(JavascriptExecutor)driver;

//scroll by 500

//js.executeScript("window.scrollBy(0,500)");

//scroll till end of teh page

//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


//scroll to specific element

//first locate the WebElement 

WebElement loc=driver.findElement(By.xpath("//h2[text()='New Customer']"));

System.out.println(loc.getLocation());

js.executeScript("arguments[0].scrollIntoView(true);",loc);

// Now highlighting it
Thread.sleep(2000);

js.executeScript("arguments[0].style.border='3px solid red'", loc);

// Testing triggering an alert 
js.executeScript("alert('Test Alert!');");

driver.switchTo().alert().accept();


System.out.println(loc.getLocation()); 

// Performing zoom in

js.executeScript("document.body.style.zoom='200%'");


//










		
	}

}

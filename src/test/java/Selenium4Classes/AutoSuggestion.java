package Selenium4Classes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestion {
	
	public static void main(String[] args) throws InterruptedException {
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		
		Thread.sleep(5000);

		
List<WebElement> option=		driver.findElements(By.xpath("//ul[@role='listbox']//div[@role='option']"));

System.out.println(option.size());

System.out.println("Execution Completed");

//Now 
for(WebElement all:option)
	
{
	
	System.out.println("Elements :"+all.getText());
	if(all.getText().equalsIgnoreCase("Selenium"))
	{
		//all.click();
		System.out.println("Landed on Selenium official Web Page");
		//break;
	}
}

//Detching all the suggestion 


System.out.println("All elemnet printed ");

//driver.close();
		
	}

}

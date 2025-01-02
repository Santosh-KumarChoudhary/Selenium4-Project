package Selenium4Classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDoubleClick {
	public static void main(String[] args) {
		
	
	
	
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
	
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	
	//First handling the frame
	
WebElement iframe=	driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

driver.switchTo().frame(iframe);
	
	
	WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
	
	
	//field1.click();
	
	field1.clear();
	
	String name="Santosh";
	
	field1.sendKeys(name);
	
	WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
	
	@SuppressWarnings("deprecation")
	String f2Text= field2.getAttribute("value");
	
	System.out.println("Name "+name);
	
	System.out.println("f2Text "+f2Text);
	
WebElement doube=	driver.findElement(By.xpath("//button[text()='Copy Text']"));


Actions act= new Actions(driver);

act.doubleClick(doube).perform();

if(name.equals(f2Text))
	
{
	System.out.println("Values are Same ");
}
else
{
	System.out.println("Incorrect");
}





	
	
	
	

}
}
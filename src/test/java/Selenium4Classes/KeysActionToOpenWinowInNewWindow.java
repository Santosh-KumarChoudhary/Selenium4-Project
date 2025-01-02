package Selenium4Classes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysActionToOpenWinowInNewWindow {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		
	WebElement register=	driver.findElement(By.xpath("//a[text()='Register']"));
		
		
		
	
	
String page1=	driver.getTitle();


System.out.println("Page 1 Title "+page1);
		Actions act = new Actions(driver);
		
		
		
		act.keyDown(Keys.COMMAND).click(register).keyUp(Keys.COMMAND).perform();
		
		
List<String>ids=	new ArrayList(	driver.getWindowHandles());

driver.switchTo().window(ids.get(1));

String title2=driver.getTitle();

System.out.println("title2 "+title2);
		

driver.findElement(By.name("FirstName")).sendKeys("Welcome to Registeration page");

System.out.println("Execution Over");
		
	}

}
